package com.inexture.springDemo.Beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;

public class UserBean {

	@Value("jay")
	private String name;
	
	@Autowired
	private UserAddress useraddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Lookup
	public UserAddress getUseraddress() {
		return useraddress;
	}

	@Lookup
	public void setUseraddress(UserAddress useraddress) {
		this.useraddress = useraddress;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", useraddress=" + useraddress + "]";
	}

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBean(String name, UserAddress useraddress) {
		super();
		this.name = name;
		this.useraddress = useraddress;
	}

}
