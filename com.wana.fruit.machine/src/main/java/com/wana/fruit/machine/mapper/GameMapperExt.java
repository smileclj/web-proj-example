package com.wana.fruit.machine.mapper;

import org.springframework.stereotype.Repository;

import com.wana.fruit.machine.model.entity.Game;

@Repository
public interface GameMapperExt extends GameMapper {
	/**
	 * 查找有效的游戏
	 * 
	 * @author chenlj
	 * @Date 2016 下午4:09:45
	 */
	Game findValidGame();
}