package com.design.behavioral.observor;

public class HRManager extends Observer2 {

	@Override
	public void update(String id) {
		System.out.println("Mail sent to HR for Emp-ID= "+id);		
	}

}
