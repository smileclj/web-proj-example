package com.wana.fruit.machine.common.resp;

import java.util.HashMap;
import java.util.Map;

import com.wana.fruit.machine.common.enums.ErrorCode;

public class Result {
	private int errcode; // 返回码
	private String errmsg; // 返回说明
	private long serverTime; // 服务器时间
	private Map<String, Object> data; // 返回内容

	public Result() {
		this.errcode = ErrorCode.SUCCESS.getKey();
		this.errmsg = ErrorCode.SUCCESS.getMsg();
		this.serverTime = System.currentTimeMillis();
		this.data = new HashMap<String, Object>();
	}

	public Result(Map<String, Object> data) {
		this.errcode = ErrorCode.SUCCESS.getKey();
		this.errmsg = ErrorCode.SUCCESS.getMsg();
		this.serverTime = System.currentTimeMillis();
		this.data = data;
	}

	public Result(ErrorCode errorCode) {
		this.errcode = errorCode.getKey();
		this.errmsg = errorCode.getMsg();
		this.data = new HashMap<String, Object>();
	}

	public Result(ErrorCode errorCode, Map<String, Object> data) {
		this.errcode = errorCode.getKey();
		this.errmsg = errorCode.getMsg();
		this.serverTime = System.currentTimeMillis();
		if (data != null) {
			this.data = data;
		} else {
			this.data = new HashMap<String, Object>();
		}
	}

	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(ErrorCode errcode) {
		this.errcode = errcode.getKey();
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(ErrorCode errcode) {
		this.errmsg = errcode.getMsg();
	}

	public long getServerTime() {
		return serverTime;
	}

	public void setServerTime(long serverTime) {
		this.serverTime = serverTime;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public void setError(ErrorCode errcode) {
		this.errcode = errcode.getKey();
		this.errmsg = errcode.getMsg();
	}

	public void put(String key, Object value) {
		this.data.put(key, value);
	}
}
