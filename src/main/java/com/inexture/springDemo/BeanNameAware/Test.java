package com.inexture.springDemo.BeanNameAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		UserBean bean = context.getBean("userbean",UserBean.class);
		System.out.println(bean);
		context.close();
	}
}
