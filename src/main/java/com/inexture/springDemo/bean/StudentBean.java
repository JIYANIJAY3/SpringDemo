package com.inexture.springDemo.bean;

public class StudentBean {

	private String Id;
	private String Name;
	private String StudentAddress;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}

	public StudentBean(String id, String name, String studentAddress) {
		super();
		Id = id;
		Name = name;
		StudentAddress = studentAddress;
	}

	public StudentBean() {
		super();
	}

	@Override
	public String toString() {
		return "StudentBean [Id=" + Id + ", Name=" + Name + ", StudentAddress=" + StudentAddress + "]";
	}
}
