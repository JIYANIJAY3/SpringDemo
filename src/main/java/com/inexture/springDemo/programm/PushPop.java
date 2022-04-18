package com.inexture.springDemo.programm;

import java.util.Stack;

import org.springframework.beans.factory.BeanNameAware;

public class PushPop implements BeanNameAware {

	private Stack<Integer> stack;

	@Override
	public String toString() {
		return "PushPop [stack=" + stack + "]";
	}

	public Stack<Integer> getStack() {
		return stack;
	}

	public void setStack(Stack<Integer> stack) {
		this.stack = stack;
	}

	public void setBeanName(String name) {
		System.out.println(name + "Bean Called");
	}
}
