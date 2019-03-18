package com.design.behavioral.observor;

public class ProjectManager extends Observer2{
	
	@Override
	public void update(String id) {
		System.out.println("Mail sent to Project Manager for Emp-ID= "+id);		
	}
	
}
