package com.wana.fruit.machine.web.interceptor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.wana.fruit.machine.common.enums.ErrorCode;
import com.wana.fruit.machine.common.exception.FruitException;
import com.wana.fruit.machine.common.resp.Result;
import com.wana.util.JSONUtil;

public class FruitExceptionInterceptor implements HandlerExceptionResolver {
	private final static Logger logger = LoggerFactory.getLogger(FruitExceptionInterceptor.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse resp, Object handler, Exception e) {
		try {
			resp.setContentType("application/json; charset=utf-8");
			PrintWriter writer = resp.getWriter();
			Result result = new Result();
			if (e instanceof FruitException) {
				FruitException fruitException = (FruitException) e;
				logger.error(e.getMessage());
				result.setError(fruitException.getErrorCode());
			}
			// 主键冲突
			else if (e instanceof org.springframework.dao.DuplicateKeyException) {
				logger.error(e.getMessage(), e);
				result.setError(ErrorCode.ERROR_REPEAT);
			}
			// 连接异常
			else if (e.getCause() instanceof java.net.ConnectException) {
				logger.error(e.getMessage(), e);
				result.setError(ErrorCode.ACTION_NOT_EXIST);
			} else {
				// 未知错误，打印堆栈
				e.printStackTrace();
				logger.error(e.getMessage(), e);
				result.setError(ErrorCode.UNKNOW);
			}
			writer.write(JSONUtil.getJson(result));
			return new ModelAndView();
		} catch (IOException e1) {
			logger.error("FruitExceptionInterceptor io error", e1);
		} finally {
			try {
				resp.getWriter().close();
			} catch (IOException e2) {
				logger.error("FruitExceptionInterceptor close error", e2);
			}
		}
		return null;
	}
}
