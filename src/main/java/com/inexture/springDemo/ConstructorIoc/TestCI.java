package com.inexture.springDemo.ConstructorIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/inexture/springDemo/ConstructorIoc/CIConfig.xml");

		UserBean userBean = (UserBean) context.getBean("userbean");
		System.out.println(userBean);
		
		AmbguityDemo ambguityDemo = (AmbguityDemo) context.getBean("ambguitydemo");
		ambguityDemo.doSum();
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
