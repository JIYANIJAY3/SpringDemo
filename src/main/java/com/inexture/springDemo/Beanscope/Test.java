package com.inexture.springDemo.Beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		UserBean bean = context.getBean("userbean",UserBean.class);
		UserBean bean2 = context.getBean("userbean",UserBean.class);
		UserAddress address = context.getBean("useraddressbean",UserAddress.class);

		System.out.println(bean.getUseraddress().hashCode());
		System.out.println(bean2.getUseraddress().hashCode());
		
	}
}

