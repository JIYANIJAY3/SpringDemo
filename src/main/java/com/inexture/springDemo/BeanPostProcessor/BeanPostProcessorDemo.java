package com.inexture.springDemo.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(
				"Calling bean post processor before init for bean:: " + beanName + "class name: " + bean.getClass());
		return bean;
	}
}
