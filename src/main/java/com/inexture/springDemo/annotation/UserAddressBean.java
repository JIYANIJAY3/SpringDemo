package com.inexture.springDemo.annotation;

import org.springframework.beans.factory.annotation.Value;

public class UserAddressBean {

    @Value("india")
    private String country;
    @Value("Ahmedabad")
    private  String city;
    @Value("387006")
    private  String pincod;

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

    public String getPincod() {
        return pincod;
    }

    public void setPincod(String pincod) {
        this.pincod = pincod;
    }

    @Override
    public String toString() {
        return "UserAddressBean{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", pincod='" + pincod + '\'' +
                '}';
    }
}
