package com.inexture.springDemo.refbean;

public class UserBean {

	private String firstName;
	private String lastName;
	private AddressBean addressBean;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AddressBean getAddressBean() {
		return addressBean;
	}

	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}

	public UserBean() {
		super();
	}

	public UserBean(String firstName, String lastName, AddressBean addressBean) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressBean = addressBean;
	}

	@Override
	public String toString() {
		return "UserBean [firstName=" + firstName + ", lastName=" + lastName + ", addressBean=" + addressBean + "]";
	}

}
