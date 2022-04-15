package com.inexture.springDemo.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserBean {
	
	@Value("jay")
	private String name;
	
	@Value("101")
	private int id;

	@Value("#{subject}")
	private List<String> subject;
	
	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

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
		return "UserBean [name=" + name + ", id=" + id + ", subject=" + subject + "]";
	}

}
