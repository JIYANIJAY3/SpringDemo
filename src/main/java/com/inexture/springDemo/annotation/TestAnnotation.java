package com.inexture.springDemo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        UserBean userBean = context.getBean("userBean",UserBean.class);
        System.out.println(userBean);
        userBean.setName("jiyani");
        System.out.println(userBean);
        userBean.display();
        context.close();
    }
}
