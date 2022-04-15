package com.inexture.springDemo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class UserBean {

    @Value("Jay")
    private String name;
    @Value("101")
    private String id;
    
    @Autowired
    @Qualifier("useraddress")
    private UserAddressBean userAddressBean;

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display()
    {
        System.out.println( this.userAddressBean.toString());
        System.out.println("This Is UserBean Method");
    }
}
