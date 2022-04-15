package com.inexture.springDemo.standalone.collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneCollectionTset {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/springDemo/standalone/collection/Config.xml");
		
		UserBean userBean = context.getBean("userbean",UserBean.class);
		System.out.println(userBean);
		System.out.println(userBean.getSubject().getClass().getName());
		context.close();
	}
}
