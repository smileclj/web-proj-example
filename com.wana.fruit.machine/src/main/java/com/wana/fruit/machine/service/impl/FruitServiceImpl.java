package com.wana.fruit.machine.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.wana.dto.ResultDto;
import com.wana.fruit.machine.common.enums.ErrorCode;
import com.wana.fruit.machine.common.enums.ItemTypeEnum;
import com.wana.fruit.machine.common.enums.PlayMethodEnum;
import com.wana.fruit.machine.common.exception.FruitException;
import com.wana.fruit.machine.mapper.GameItemConfigMapperExt;
import com.wana.fruit.machine.mapper.GameMapConfigMapperExt;
import com.wana.fruit.machine.mapper.GameMapperExt;
import com.wana.fruit.machine.mapper.GameRecordMapperExt;
import com.wana.fruit.machine.model.dto.game.GameRecordListReqDto;
import com.wana.fruit.machine.model.entity.Game;
import com.wana.fruit.machine.model.entity.GameItemConfig;
import com.wana.fruit.machine.model.entity.GameMapConfig;
import com.wana.fruit.machine.model.entity.GameRecord;
import com.wana.fruit.machine.service.FruitService;
import com.wana.fruit.machine.util.common.DateUtil;
import com.wana.fruit.machine.util.common.UUIDUtil;
import com.wana.portal.remote.interfaces.UserInterface;

@Service("fruitService")
public class FruitServiceImpl implements FruitService {
	@Resource
	private GameMapperExt gameMapperExt;
	@Resource
	private GameItemConfigMapperExt gameItemConfigMapperExt;
	@Resource
	private GameMapConfigMapperExt gameMapConfigMapperExt;
	@Resource
	private GameRecordMapperExt gameRecordMapperExt;
	@Resource
	private UserInterface userInterface;

	private Random random = new Random();
	private Map<Integer, GameItemConfig> itemConfig = new HashMap<Integer, GameItemConfig>();
	private Map<Integer, GameMapConfig> mapConfig = new HashMap<Integer, GameMapConfig>();
	private Integer[] leftLuck = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18, 22, 23 };
	private Integer[] rightLuck = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23 };
	private int luckNum = 3;

	@Override
	public void init() {
		Game game = gameMapperExt.findValidGame();
		List<GameItemConfig> itemConfigList = gameItemConfigMapperExt.findByGameNo(game.getNo());
		_initItemConfig(itemConfigList);
		List<GameMapConfig> mapConfigList = gameMapConfigMapperExt.findByGameNo(game.getNo());
		_initMapConfig(mapConfigList);
	}

	private void _initItemConfig(List<GameItemConfig> itemConfigList) {
		for (GameItemConfig item : itemConfigList) {
			itemConfig.put(item.getNo(), item);
		}
	}

	private void _initMapConfig(List<GameMapConfig> mapConfigList) {
		for (GameMapConfig map : mapConfigList) {
			mapConfig.put(map.getNo(), map);
		}
	}

	@Override
	public int addGame(Game game) {
		return gameMapperExt.insertSelective(game);
	}

	@Override
	public int addGameItemConfig(GameItemConfig itemConfig) {
		return gameItemConfigMapperExt.insertSelective(itemConfig);
	}

	@Override
	public int addGameMapConfig(GameMapConfig gameMapConfig) {
		return gameMapConfigMapperExt.insertSelective(gameMapConfig);
	}

	@Override
	public Map<String, Object> play(int userId, int betRate, Integer[] betContent) {
		Map<String, Object> result = new HashMap<String, Object>();
		int sumCount = 0;
		for (int c : betContent) {
			sumCount += c;
		}
		int consumeCoin = betRate * sumCount;
		// 扣用户金币
		ResultDto<Integer> resultDto = userInterface.addCoinForFruit(userId, consumeCoin * -1);
		if (resultDto.getCode() == ResultDto.Result.FAIL.value) {
			throw new FruitException(ErrorCode.COIN_NOT_ENOUGH);
		} else if (resultDto.getCode() == ResultDto.Result.UNKNOW_ERROR.value) {
			throw new FruitException(ErrorCode.UNKNOW);
		}
		String gameId = UUIDUtil.create();
		int randomNum = random.nextInt(24); // 0-23
		GameMapConfig m = mapConfig.get(randomNum);
		List<GameMapConfig> rotateList = new ArrayList<GameMapConfig>();
		List<Integer> rotateNoList = new ArrayList<Integer>();
		switch (ItemTypeEnum.keyOf(m.getType())) {
		case LEFT_LUCK:
			int randomNumForLeft = random.nextInt(leftLuck.length);
			int mapIndex = leftLuck[randomNumForLeft];
			for (int i = 0; i < luckNum; i++) {
				mapIndex += i;
				mapIndex = mapIndex > 23 ? mapIndex - 23 : mapIndex;
				rotateList.add(mapConfig.get(mapIndex));
				rotateNoList.add(mapIndex);
			}
			result.put("luck", "left");
			break;
		case RIGHT_LUCK:
			List<Integer> rightLuckList = Arrays.asList(rightLuck);
			Collections.shuffle(rightLuckList);
			List<Integer> subRightLuckList = rightLuckList.subList(0, luckNum);
			for (Integer mapIndex2 : subRightLuckList) {
				rotateList.add(mapConfig.get(mapIndex2));
				rotateNoList.add(mapIndex2);
			}
			result.put("luck", "right");
			break;
		default:
			result.put("luck", "no");
			rotateList.add(m);
			rotateNoList.add(randomNum);
		}
		result.put("consumeCoin", consumeCoin);
		result.put("gameId", gameId);
		result.put("rotateList", StringUtils.join(rotateNoList, ","));
		result.put("gainCoin", _exchange(gameId, userId, consumeCoin, betRate, rotateList, betContent, PlayMethodEnum.ONE));
		return result;
	}

	private int _exchange(String gameId, int userId, int consumeCoin, int betRate, List<GameMapConfig> rotateList, Integer[] betContent, PlayMethodEnum method) {
		int gainCoin = 0;
		List<Integer> rotateResult = new ArrayList<Integer>();
		for (GameMapConfig rotate : rotateList) {
			rotateResult.add(rotate.getNo());
			int betNum = betContent[rotate.getType()];
			if (betNum > 0) { // 有押注
				int rate = rotate.getRate() > 0 ? rotate.getRate() : itemConfig.get(rotate.getType()).getRate();
				gainCoin += betNum * rate;
			}
		}
		gainCoin *= betRate;

		GameRecord record = new GameRecord();
		record.setId(gameId);
		record.setBetCoinTotal(consumeCoin);
		record.setBetContent(StringUtils.join(betContent, ","));
		record.setBetRate(betRate);
		record.setCreateTime(new Date());
		record.setGainCoinTotal(gainCoin);
		record.setIsPrize(false);
		record.setMethod(method.getKey());
		record.setResult(StringUtils.join(rotateResult, ","));
		record.setUserId(userId);
		gameRecordMapperExt.insertSelective(record);
		return gainCoin;
	}

	@Override
	public Integer award(String gameId) {
		int userCoin = 0;
		GameRecord record = gameRecordMapperExt.selectByPrimaryKey(gameId);
		if (record == null) {
			throw new FruitException(ErrorCode.GAME_NOT_EXIST);
		}
		if (record.getIsPrize()) {
			throw new FruitException(ErrorCode.AWARD_REPEAT);
		}
		// 给用户加金币
		boolean addCoinResult = true;
		if (record.getGainCoinTotal() > 0) {
			ResultDto<Integer> resultDto = userInterface.addCoinForFruit(record.getUserId(), record.getGainCoinTotal());
			if (resultDto.getCode() != ResultDto.Result.SUCCESS.value) {
				addCoinResult = false;
			} else {
				userCoin = resultDto.getData();
			}
		}
		if (addCoinResult) {
			record.setIsPrize(true);
			gameRecordMapperExt.updateByPrimaryKeySelective(record);
		}
		return userCoin;
	}

	@Override
	public List<GameRecord> getGameRecordList(GameRecordListReqDto dto) {
		if (dto.getStart() != null) {
			dto.setStart(DateUtil.getStartDate(dto.getStart()));
		}
		if (dto.getEnd() != null) {
			dto.setEnd(DateUtil.getEndDate(dto.getEnd()));
		}
		dto.setTotal(gameRecordMapperExt.countGameRecords(dto));
		return gameRecordMapperExt.findGameRecords(dto);
	}
}
