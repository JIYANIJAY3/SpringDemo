package com.inexture.springDemo.ConstructorIoc;

public class Collage {
	
	private String collageName;
	
	
	public Collage(String collageName) {
		super();
		this.collageName = collageName;
	}


	public Collage() {
		super();
	}


	@Override
	public String toString() {
		return collageName;
	}
	
}
