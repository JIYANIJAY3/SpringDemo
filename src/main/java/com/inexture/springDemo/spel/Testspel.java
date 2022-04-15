package com.inexture.springDemo.spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testspel {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/springDemo/spel/Config.xml");
		
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);
		context.close();
	}	
}
