package com.inexture.springDemo.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotation {

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
		return "UsingAnnotation [name=" + name + ", id=" + id + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("init method called");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method called");
	}
}
