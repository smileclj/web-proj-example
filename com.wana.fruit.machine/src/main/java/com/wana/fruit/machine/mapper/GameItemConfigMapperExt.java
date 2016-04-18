package com.wana.fruit.machine.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.wana.fruit.machine.model.entity.GameItemConfig;

@Repository
public interface GameItemConfigMapperExt extends GameItemConfigMapper {
	/**
	 * 根据游戏标识查找配置
	 * 
	 * @author chenlj
	 * @Date 2016 下午4:12:39
	 */
	List<GameItemConfig> findByGameNo(@Param("gameNo") String gameNo);
}