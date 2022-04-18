package com.inexture.springDemo.BeanNameAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.inexture.springDemo.BeanNameAware")
public class ConfigurationClass {
	
	@Bean(name = {"userbean"})
	public UserBean getUserBean()
	{
		return new UserBean();
	}
}
