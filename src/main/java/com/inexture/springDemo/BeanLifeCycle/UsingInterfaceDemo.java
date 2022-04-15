package com.inexture.springDemo.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterfaceDemo implements InitializingBean, DisposableBean {
	private String name;
	private int id;

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

	@Override
	public String toString() {
		return "UsingInterfaceDemo [name=" + name + ", id=" + id + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Destroy method called");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method called");
	}

}
