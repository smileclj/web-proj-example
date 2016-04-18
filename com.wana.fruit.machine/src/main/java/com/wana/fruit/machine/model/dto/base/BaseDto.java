package com.wana.fruit.machine.model.dto.base;

import com.wana.util.StringUtil;

public abstract class BaseDto {
	protected boolean validateStringParams(String... params) {
		for (String param : params) {
			if (StringUtil.isEmpty(param)) {
				return false;
			}
		}
		return true;
	}

	protected abstract boolean validate();
}
