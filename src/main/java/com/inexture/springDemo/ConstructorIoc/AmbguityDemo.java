package com.inexture.springDemo.ConstructorIoc;

public class AmbguityDemo {

	private int num1;
	private int num2;

	public AmbguityDemo(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("int, int");
	}

	public AmbguityDemo(double num1, double num2) {
		super();
		this.num1 = (int) num1; 
		this.num2 = (int) num2;
		System.out.println("double, double");
	}

	public AmbguityDemo(String num1, String num2) {
		super();
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("String, String");
	}

	public void doSum() {
		System.out.println(this.num1 + this.num2);
	}
}
