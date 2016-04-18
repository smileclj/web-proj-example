package com.wana.fruit.machine.controller;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.wana.fruit.machine.util.business.TokenUtil;
import com.wana.fruit.machine.util.common.HttpUtil;

public class FruitControllerTest {
	@Test
	public void play() {
		String url = "http://localhost:8082/fruit/game/play.htm";
		Map<String, String> params = new HashMap<String, String>();
		params.put("userToken", TokenUtil.getUserToken(297901));
		params.put("betRate", "1");
		params.put("betContent", "1,1,1,1,1,1,1,1");
		System.out.println(HttpUtil.get(url, params));
	}

	@Test
	public void award() {
		String url = "http://localhost:8082/fruit/game/award.htm";
		Map<String, String> params = new HashMap<String, String>();
		params.put("gameId", "b8eaa61b111d44e6bc12256db1a00b8c");
		System.out.println(HttpUtil.get(url, params));
	}
	
	@Test
	public void getGameRecordList() {
		String url = "http://localhost:8082/fruit/game/getGameRecordList.htm";
		Map<String, String> params = new HashMap<String, String>();
		params.put("pageNumber", "1");
		params.put("pageSize", "10");
		System.out.println(HttpUtil.get(url, params));
	}
}
