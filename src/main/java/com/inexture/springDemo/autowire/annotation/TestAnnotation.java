package com.inexture.springDemo.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/springDemo/autowire/annotation/Config.xml");

		UserBean userBean = context.getBean("userbean", UserBean.class);
		System.out.println(userBean);
		context.close();
	}
}
