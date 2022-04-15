package com.inexture.springDemo.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/inexture/springDemo/BeanLifeCycle/Config.xml");
		
//		UsingXmlDemo xmlDemo = (UsingXmlDemo) context.getBean("usingxml");
//		System.out.println(xmlDemo);
		
//		UsingInterfaceDemo interfaceDemo = (UsingInterfaceDemo) context.getBean("usinginterface");
//		System.out.println(interfaceDemo);
		
		UsingAnnotation usingAnnotation = (UsingAnnotation) context.getBean("usingannotation");
		System.out.println(usingAnnotation);
		context.registerShutdownHook();
		context.close();
	}
}
