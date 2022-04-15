package com.inexture.springDemo.standalone.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class UserBean {

	private String name;
	private int id;
	private List<String> subject;

	@Autowired
	private UserAddressBean userAddressBean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	public UserAddressBean getUserAddressBean() {
		return userAddressBean;
	}

	public void setUserAddressBean(UserAddressBean userAddressBean) {
		this.userAddressBean = userAddressBean;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", id=" + id + ", subject=" + subject + ", userAddressBean=" + userAddressBean
				+ "]";
	}

}
