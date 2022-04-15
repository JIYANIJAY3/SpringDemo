package com.inexture.sprigDemo.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTest {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/sprigDemo/autowire/Config.xml");
		
		UserBean userBean = (UserBean) context.getBean("userbean");
		System.out.println(userBean);
		context.close();
	}
}
