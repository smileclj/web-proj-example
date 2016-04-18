package com.wana.fruit.machine.common.exception;

import com.wana.fruit.machine.common.enums.ErrorCode;

public class FruitException extends RuntimeException {
	private static final long serialVersionUID = -7518158876082240563L;
	protected ErrorCode code;

	public FruitException(ErrorCode code) {
		this.code = code;
	}

	public FruitException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}

	public FruitException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		if (code != null) {
			return code.getMsg();
		} else {
			return null;
		}
	}

	public ErrorCode getErrorCode() {
		return this.code;
	}
}
