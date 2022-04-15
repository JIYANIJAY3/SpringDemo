package com.inexture.springDemo.autowire.annotation;

public class AddressBean {

	private String country;
	private String city;
	private String pincode;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressBean [country=" + country + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
