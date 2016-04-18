package com.wana.fruit.machine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wana.util.StringUtil;

public class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected boolean validateStringParams(String... params) {
		for (String param : params) {
			if (StringUtil.isEmpty(param)) {
				return false;
			}
		}
		return true;
	}
}
