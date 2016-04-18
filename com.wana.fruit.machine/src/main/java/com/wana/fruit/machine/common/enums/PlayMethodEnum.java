package com.wana.fruit.machine.common.enums;

public enum PlayMethodEnum {
	ONE("one", "一次"), 
	LEFT_LUCK("left_luck", "左侧幸运"), 
	RIGHT_LUCK("right_luck", "右侧幸运"), 
	UNKNOW("unknow", "未知");

	private String key;
	private String value;

	private PlayMethodEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public static PlayMethodEnum keyOf(String key) {
		PlayMethodEnum result = PlayMethodEnum.UNKNOW;
		for (PlayMethodEnum e : PlayMethodEnum.values()) {
			if (e.getKey().equals(key)) {
				result = e;
				break;
			}
		}
		return result;
	}
}
