package com.wana.fruit.machine.hessian;

import java.net.MalformedURLException;

import org.junit.Test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.wana.portal.remote.interfaces.UserInterface;

public class HessianTest {

	@Test
	public void testUserInterface() throws MalformedURLException {
		String url = "http://localhost:8080/portal/remote/userInterface";
		HessianProxyFactory factory = new HessianProxyFactory();
		UserInterface userInterface = (UserInterface) factory.create(UserInterface.class, url);
		userInterface.addCoinForFruit(297901, 1);
	}
}
