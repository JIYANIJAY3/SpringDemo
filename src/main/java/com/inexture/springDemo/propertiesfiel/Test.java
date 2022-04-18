package com.inexture.springDemo.propertiesfiel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/springDemo/propertiesfiel/Config.xml");
		
		Userbean userbean = context.getBean("userbean",Userbean.class);
		System.out.println(userbean.getPassword());
		context.close();
	}
}
