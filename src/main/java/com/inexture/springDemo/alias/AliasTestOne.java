package com.inexture.springDemo.alias;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AliasTestOne {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/springDemo/alias/Config.xml");
		UserBean userBean = context.getBean("userbean", UserBean.class);
		System.out.println(userBean);
		context.close();
	}
}
