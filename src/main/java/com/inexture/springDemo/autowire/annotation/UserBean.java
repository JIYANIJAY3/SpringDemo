package com.inexture.springDemo.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserBean {

	private String name;
	@Autowired
//	@Qualifier("addressbean")
	private AddressBean addressbean1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressBean getAddressbean() {
		return addressbean1;
	}
	
	public void setAddressbean(AddressBean addressbean) {
		this.addressbean1 = addressbean;
		System.out.println("Inside Setter");
	}

	public UserBean() {
		super();
	}

	public UserBean(String name, AddressBean addressbean) {
		super();
		this.name = name;
		this.addressbean1 = addressbean;
		System.out.println("Inside Constructor");
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", addressbean=" + addressbean1 + "]";
	}

}
