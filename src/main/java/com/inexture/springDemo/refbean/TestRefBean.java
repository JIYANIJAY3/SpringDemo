package com.inexture.springDemo.refbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefBean {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/inexture/springDemo/refbean/RefConfig.xml");

		UserBean userBean = (UserBean) context.getBean("userbean");
		System.out.println(userBean);
		((ClassPathXmlApplicationContext) context).close();
		
	}
}
