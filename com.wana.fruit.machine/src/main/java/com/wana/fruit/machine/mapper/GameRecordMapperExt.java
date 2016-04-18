package com.wana.fruit.machine.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wana.fruit.machine.model.dto.game.GameRecordListReqDto;
import com.wana.fruit.machine.model.entity.GameRecord;

@Repository
public interface GameRecordMapperExt extends GameRecordMapper {
	/**
	 * 获取符合条件的游戏记录列表
	 * 
	 * @author chenlj
	 * @Date 2016 下午5:56:06
	 */
	List<GameRecord> findGameRecords(GameRecordListReqDto dto);

	/**
	 * 查询符合条件的游戏记录条数
	 * 
	 * @author chenlj
	 * @Date 2016 下午6:17:04
	 */
	int countGameRecords(GameRecordListReqDto dto);
}