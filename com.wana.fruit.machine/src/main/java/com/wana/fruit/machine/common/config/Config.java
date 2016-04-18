package com.wana.fruit.machine.common.config;

import java.util.HashMap;
import java.util.Map;

import com.wana.fruit.machine.util.common.PropertiesUtil;

public class Config {
	public static Map<String, String> manager = new HashMap<String, String>();
	// token
	public static String TOKEN_URL;

	static {
		manager = new PropertiesUtil("config.properties").getAllProperty();
		TOKEN_URL = manager.get("token.url");
	}
}
