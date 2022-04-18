package com.inexture.springDemo.programm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.inexture.springDemo.programm")
public class ConfigurationClass {
	
	@Bean(name = {"pushpop"})
	public PushPop getPushPop()
	{
		return new PushPop();
	}
}
