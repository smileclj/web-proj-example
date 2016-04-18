package com.wana.fruit.machine.hessian;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wana.portal.remote.interfaces.UserInterface;
import com.wana.util.JSONUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class SpringHessianTest {

	@Resource
	private UserInterface userInterface;

	@Test
	public void userInterface() {
		System.out.println(JSONUtil.getJson(userInterface.addCoinForFruit(297901, 1)));
	}
}
