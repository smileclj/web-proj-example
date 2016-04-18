package com.wana.fruit.machine.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wana.fruit.machine.model.dto.game.GameRecordListReqDto;
import com.wana.util.JSONUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class FruitServiceTest {

	@Resource
	private FruitService fruitService;

	@Test
	public void play() {
		System.out.println(JSONUtil.getJson(fruitService.play(297901, 1, new Integer[] { 1, 1, 1, 1, 1, 1, 1, 1 })));
	}

	@Test
	public void getGameRecordList() {
		GameRecordListReqDto dto = new GameRecordListReqDto();
		dto.setPrize(true);
		dto.setPageNumber(1);
		dto.setPageSize(10);
		System.out.println(JSONUtil.getJson(fruitService.getGameRecordList(dto)));
	}

	@Test
	public void award() {
		fruitService.award("");
	}
}
