package com.inexture.springDemo.BeanPostProcessor;

import org.springframework.beans.factory.annotation.Value;

public class UserBean {
	@Value("jay")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + "]";
	}

}
