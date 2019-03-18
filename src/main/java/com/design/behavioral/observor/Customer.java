package com.design.behavioral.observor;

public class Customer extends Observer1{
	
	String personName;

	public Customer(String personName) {
		this.personName = personName;
	}

	@Override
	public void update() {
		System.out.println("Hello "+personName+", Product is avaialble now.");
	}

}
