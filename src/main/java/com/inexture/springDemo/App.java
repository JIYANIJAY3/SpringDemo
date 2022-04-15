package com.inexture.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.inexture.springDemo.bean.EmployeeBean;
import com.inexture.springDemo.bean.StudentBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello Spring :) ");

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "Config.xml","com/inexture/springDemo/bean/EmployeeConfig.xml"});

		System.out.println("------------------------------------------------------------");
		System.out.println("This Is Student Part");

		StudentBean studentBean = (StudentBean) context.getBean("studentbean");
		System.out.println(studentBean);

		Resource resource = new ClassPathResource("Config.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		StudentBean bean = (StudentBean) beanFactory.getBean("studentbean");
		System.out.println(bean);

		StudentBean studentBean2 = (StudentBean) context.getBean("studentbean2");
		System.out.println(studentBean2);

		StudentBean studentBean3 = (StudentBean) context.getBean("student3");
		System.out.println(studentBean3);

		StudentBean studentBean4 = (StudentBean) context.getBean("student");
		System.out.println(studentBean4);
		System.out.println("---------------------------------------------------------------");

		EmployeeBean employeeBean = (EmployeeBean) context.getBean("employeebean");
		System.out.println(employeeBean);
	}
}
