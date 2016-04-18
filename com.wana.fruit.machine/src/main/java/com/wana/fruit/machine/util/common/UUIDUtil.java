package com.wana.fruit.machine.util.common;

import java.util.UUID;

public class UUIDUtil {

	public static String create() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
