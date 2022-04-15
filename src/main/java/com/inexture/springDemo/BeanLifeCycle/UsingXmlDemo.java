package com.inexture.springDemo.BeanLifeCycle;

public class UsingXmlDemo {

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

	public UsingXmlDemo(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public UsingXmlDemo() {
		super();
	}

	@Override
	public String toString() {
		return "UsingXmlDemo [name=" + name + ", id=" + id + "]";
	}
	
	public void init()
	{
		System.out.println("Invlok init method");
	}
	
	public void destroy()
	{
		System.out.println("Destroy Method Called");
	}
}
