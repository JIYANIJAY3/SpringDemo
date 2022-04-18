package com.inexture.springDemo.filesystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:FileConfig.xml");
		UserBean userBean = context.getBean("userbean",UserBean.class);
		System.out.println(userBean);
	}
}
