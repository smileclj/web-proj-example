package com.wana.fruit.machine.util.business;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wana.fruit.machine.common.config.Config;
import com.wana.fruit.machine.model.dto.token.resp.UserInfoRespDto;
import com.wana.fruit.machine.util.common.HttpUtil;
import com.wana.util.JSONUtil;
import com.wana.util.StringUtil;

public class TokenUtil {
	private static final Logger logger = LoggerFactory.getLogger(TokenUtil.class);

	public static String getUserToken(int userId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("cmd", "getToken");
		params.put("userId", String.valueOf(userId));
		return HttpUtil.get(Config.TOKEN_URL, params);
	}

	public static int getUserId(String token) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("cmd", "getUserInfo");
		params.put("token", token);
		String userInfoStr = HttpUtil.get(Config.TOKEN_URL, params);
		if (StringUtil.isEmpty(userInfoStr)) {
			return 0;
		}
		try {
			UserInfoRespDto userInfo = JSONUtil.getObjectFromJson(userInfoStr, UserInfoRespDto.class);
			return userInfo.getId();
		} catch (Exception e) {
			logger.error("反序列化token中用户信息发生错误 {}", e);
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(TokenUtil.getUserToken(297901));
		
		System.out.println(TokenUtil.getUserId("f5f9438653de4bcdb6743992f87e92db"));
	}
}
