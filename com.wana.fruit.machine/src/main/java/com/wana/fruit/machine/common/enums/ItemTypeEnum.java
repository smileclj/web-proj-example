package com.wana.fruit.machine.common.enums;

public enum ItemTypeEnum {
	GOLD_SHARK(0, "金鲨"), 
	SLIVER_SHARK(1, "银鲨"), 
	WING_FISH(2, "翅膀鱼"), 
	TORTOISE(3, "乌龟"), 
	LANTERN_FISH(4, "灯笼鱼"), 
	LOBSTER(5,"龙虾"),
	NIMO(6,"尼莫"),
	YELLOW_FISH(7,"小黄鱼"),
	LEFT_LUCK(8,"左侧幸运"),
	RIGHT_LUCK(9,"右侧幸运"),
	UNKNOW(-1, "未知");

	private int key;
	private String value;

	private ItemTypeEnum(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public static ItemTypeEnum keyOf(int key) {
		ItemTypeEnum result = ItemTypeEnum.UNKNOW;
		for (ItemTypeEnum e : ItemTypeEnum.values()) {
			if (e.getKey() == key) {
				result = e;
				break;
			}
		}
		return result;
	}
}
