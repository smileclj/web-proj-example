package com.wana.fruit.machine.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wana.fruit.machine.common.enums.ErrorCode;
import com.wana.fruit.machine.common.exception.FruitException;
import com.wana.fruit.machine.common.resp.Result;
import com.wana.fruit.machine.model.dto.base.PageDto;
import com.wana.fruit.machine.model.dto.game.GameRecordListReqDto;
import com.wana.fruit.machine.model.entity.GameRecord;
import com.wana.fruit.machine.service.FruitService;
import com.wana.fruit.machine.util.business.TokenUtil;

@Controller
@RequestMapping(value = "/game")
public class FruitController extends BaseController {
	@Resource
	private FruitService fruitService;

	@RequestMapping(value = "/play")
	@ResponseBody
	public Result play(String userToken, int betRate, String betContent) {
		if (!validateStringParams(userToken, betContent)) {
			throw new FruitException(ErrorCode.ERROR_PARAM);
		}
		if (betRate < 0) {
			throw new FruitException(ErrorCode.ERROR_PARAM);
		}
		int userId = TokenUtil.getUserId(userToken);
		if (userId == 0) {
			throw new FruitException(ErrorCode.AUTH_FAIL);
		}
		String[] betContentStrig = betContent.split(",");
		if (betContentStrig.length != 8) {
			throw new FruitException(ErrorCode.ERROR_PARAM);
		}
		Integer[] betContentInteger = new Integer[betContentStrig.length];
		for (int i = 0; i < betContentStrig.length; i++) {
			betContentInteger[i] = Integer.parseInt(betContentStrig[i]);
		}
		return new Result(fruitService.play(userId, betRate, betContentInteger));
	}

	@RequestMapping(value = "/award")
	@ResponseBody
	public Result award(String gameId) {
		if (!validateStringParams(gameId)) {
			throw new FruitException(ErrorCode.ERROR_PARAM);
		}
		Result result = new Result();
		int userCoin = fruitService.award(gameId);
		if (userCoin > 0) {
			result.put("userCoin", userCoin);
		}
		return result;
	}

	@RequestMapping(value = "/getGameRecordList")
	@ResponseBody
	public Result getGameRecordList(GameRecordListReqDto condition) {
		Result result = new Result();
		List<GameRecord> records = fruitService.getGameRecordList(condition);
		PageDto page = new PageDto();
		page.setPageNumber(condition.getPageNumber());
		page.setPageSize(condition.getPageSize());
		page.setTotal(condition.getTotal());
		result.put("records", records);
		result.put("page", page);
		return result;
	}
}
