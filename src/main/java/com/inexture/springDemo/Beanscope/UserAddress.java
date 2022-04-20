package com.inexture.springDemo.Beanscope;

import org.springframework.beans.factory.annotation.Value;

public class UserAddress {

	@Value("Ahmedabad")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserAddress [city=" + city + "]";
	}

	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAddress(String city) {
		super();
		this.city = city;
	}

}
