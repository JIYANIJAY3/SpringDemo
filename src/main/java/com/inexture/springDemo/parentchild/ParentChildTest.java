package com.inexture.springDemo.parentchild;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ParentChildTest {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/springDemo/parentchild/Config.xml");
		GtuBean gtuBean = context.getBean("gtubean",GtuBean.class);
		System.out.println(gtuBean);
		
		LjBean ljBean = context.getBean("ljbean",LjBean.class);
		System.out.println(ljBean.getSub1());
	}
}
