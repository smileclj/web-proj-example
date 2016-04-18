package com.wana.fruit.machine.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.wana.fruit.machine.model.entity.GameMapConfig;

@Repository
public interface GameMapConfigMapperExt extends GameMapConfigMapper {
	/**
	 * 根据游戏标识查找配置
	 * 
	 * @author chenlj
	 * @Date 2016 下午4:15:00
	 */
	List<GameMapConfig> findByGameNo(@Param("gameNo") String gameNo);
}