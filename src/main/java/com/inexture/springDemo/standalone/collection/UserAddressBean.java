package com.inexture.springDemo.standalone.collection;

public class UserAddressBean {

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
		return "UserAddressBean [country=" + country + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
