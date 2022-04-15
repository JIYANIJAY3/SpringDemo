package com.inexture.sprigDemo.autowire;

public class UserBean {

	private String name;
	private AddressBean addressbean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressBean getAddressbean() {
		return addressbean;
	}

	public void setAddressbean(AddressBean addressbean) {
		this.addressbean = addressbean;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", addressbean=" + addressbean + "]";
	}

}
