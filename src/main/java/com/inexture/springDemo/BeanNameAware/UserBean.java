package com.inexture.springDemo.BeanNameAware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;

public class UserBean implements BeanNameAware {
	
	@Value("Keyur")
	private String name;

	@Override
	public String toString() {
		return "UserBean [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBeanName(String beanName) {
		System.out.println(beanName +" bean has been initialized." );		
	}

}
