package com.inexture.springDemo.propertiesfiel;

public class Userbean {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Userbean [name=" + name + ", password=" + password + "]";
	}

}
