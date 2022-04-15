package com.inexture.springDemo.ConstructorIoc;

import java.util.List;

public class UserBean {

	private String firstName;
	private String lastName;
	private int userId;
	private Collage collage;
	private List<String> address;

	public UserBean(String firstName, String lastName, int userId, Collage collage, List<String> address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.collage = collage;
		this.address = address;
	}

	public UserBean() {
		super();
	}

	@Override
	public String toString() {
		return "UserBean [firstName=" + firstName + ", lastName=" + lastName + ", userId=" + userId + ", collage="
				+ collage + "address" + address + "]";
	}

}
