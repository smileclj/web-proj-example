package com.wana.fruit.machine.web.listener;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.wana.fruit.machine.service.FruitService;

/**
 * 执行初始化操作
 * 
 * @author chenlj
 * @Date 2016年4月13日 下午4:46:18
 */
@Component
public class InitListener implements ApplicationListener<ContextRefreshedEvent> {
	private static final Logger logger = LoggerFactory.getLogger(InitListener.class);
	@Resource
	private FruitService fruitService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// event.getApplicationContext().getDisplayName().equals("Root WebApplicationContext")
		if (event.getApplicationContext().getParent() == null) {
			fruitService.init();
			logger.info("fruit config init finish!");
		}
	}
}
