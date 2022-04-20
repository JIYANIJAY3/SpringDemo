package com.inexture.springDemo.Beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ConfigurationClass {
	
	@Bean(name = {"userbean"})
	@Scope("singleton")
	public UserBean getUserBean()
	{
		return new UserBean();
	}
	
	@Bean(name = {"useraddressbean"})
	@Scope("prototype")
	public UserAddress getUserAddress()
	{
		return new UserAddress();
	}
}
