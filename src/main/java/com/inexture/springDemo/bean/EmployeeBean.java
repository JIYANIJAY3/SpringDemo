package com.inexture.springDemo.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeBean {

	private String name;
	private List<String> phoneNumbers;
	private Set<String> address;
	private Map<String, String> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public EmployeeBean(String name, List<String> phoneNumbers, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.address = address;
		this.courses = courses;
	}

	public EmployeeBean() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeBean [name=" + name + ", phoneNumbers=" + phoneNumbers + ", address=" + address + ", courses="
				+ courses + "]";
	}

}
