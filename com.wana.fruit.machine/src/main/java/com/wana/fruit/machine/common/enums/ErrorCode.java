package com.wana.fruit.machine.common.enums;

public enum ErrorCode {
	SUCCESS(0, "成功"), 
	ERROR_PARAM(1, "参数有误"), 
	ERROR_REPEAT(2, "重复操作"), 
	ACTION_NOT_EXIST(3, "接口不存在"), 
	AUTH_FAIL(4, "权限验证失败"), 
	COIN_NOT_ENOUGH(5,"金币余额不足"),
	GAME_NOT_EXIST(6,"游戏不存在"),
	AWARD_REPEAT(7,"请勿重复领奖"),
	UNKNOW(-1, "未知错误");

	private ErrorCode(int key, String msg) {
		this.key = key;
		this.msg = msg;
	}

	/**
	 * code码
	 */
	private int key;
	/**
	 * code信息
	 */
	private String msg;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 根据code码查找
	 */
	public static ErrorCode keyOf(int key) {
		ErrorCode result = UNKNOW;
		for (ErrorCode p : ErrorCode.values()) {
			if (p.getKey() == key) {
				result = p;
			}
		}
		return result;
	}

	/**
	 * 根据msg查找
	 */
	public static ErrorCode fromMsg(String msg) {
		ErrorCode result = UNKNOW;
		for (ErrorCode p : ErrorCode.values()) {
			if (p.getMsg().equals(msg)) {
				result = p;
			}
		}
		return result;
	}
}
