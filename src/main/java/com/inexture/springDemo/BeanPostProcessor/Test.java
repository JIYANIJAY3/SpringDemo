package com.inexture.springDemo.BeanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.tools.javac.api.DiagnosticFormatter.Configuration;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		UserBean bean = context.getBean("userbean", UserBean.class);
		
		System.out.println(bean);
	}

}
