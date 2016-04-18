package com.wana.fruit.machine.service;

import java.util.List;
import java.util.Map;

import com.wana.fruit.machine.model.dto.game.GameRecordListReqDto;
import com.wana.fruit.machine.model.entity.Game;
import com.wana.fruit.machine.model.entity.GameItemConfig;
import com.wana.fruit.machine.model.entity.GameMapConfig;
import com.wana.fruit.machine.model.entity.GameRecord;

public interface FruitService {
	int addGame(Game game);

	int addGameItemConfig(GameItemConfig itemConfig);

	int addGameMapConfig(GameMapConfig gameMapConfig);

	/**
	 * 初始化游戏配置
	 * 
	 * @author chenlj
	 * @Date 2016 下午5:37:23
	 */
	void init();

	/**
	 * 水果机玩游戏调用
	 * 
	 * @author chenlj
	 * @Date 2016 下午5:37:36
	 */
	Map<String, Object> play(int userId, int betRate, Integer[] betContent);

	/**
	 * 水果机游戏结束领奖调用
	 * 
	 * @author chenlj
	 * @Date 2016 下午5:37:57
	 */
	Integer award(String gameId);

	/**
	 * 获取游戏记录列表
	 * 
	 * @author chenlj
	 * @Date 2016 下午5:53:40
	 */
	List<GameRecord> getGameRecordList(GameRecordListReqDto dto);
}
