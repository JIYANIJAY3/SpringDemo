package com.inexture.springDemo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.inexture.springDemo.annotation")
public class ConfigurationClass {

    @Bean(name = {"useraddress"})
    public UserAddressBean getUserAddress()
    {
        return new UserAddressBean();
    }
    @Bean(name = {"userBean"})
    public UserBean getUserBean()
    {
        UserBean userBean = new UserBean();
        return  userBean;
    }
}
