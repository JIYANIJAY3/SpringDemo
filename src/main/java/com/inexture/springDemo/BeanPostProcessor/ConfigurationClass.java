package com.inexture.springDemo.BeanPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.inexture.springDemo.BeanPostProcessor")
public class ConfigurationClass {
	
	@Bean(name = {"userbean"})
	public UserBean getUserBean()
	{
		return new UserBean();
	}
	
	@Bean
	public BeanPostProcessorDemo getBeanPostProcessorDemo()
	{
		return new BeanPostProcessorDemo();
	}
}
