package com.inexture.springDemo.parentchild;

public class LjBean {

	private String sub1;
	private String sub2;

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	@Override
	public String toString() {
		return "LjBean [sub1=" + sub1 + ", sub2=" + sub2 + "]";
	}

}
