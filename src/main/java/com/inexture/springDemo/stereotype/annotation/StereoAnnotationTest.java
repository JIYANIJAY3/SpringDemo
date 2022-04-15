package com.inexture.springDemo.stereotype.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoAnnotationTest {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/springDemo/stereotype/annotation/Config.xml");
		
		UserBean userBean = context.getBean("userBean",UserBean.class);
		System.out.println(userBean);
		context.close();
	}
}
