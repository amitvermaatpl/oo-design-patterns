package com.design.behavioral.observor;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	String name;
	String empId;
	boolean isActive =true;
	
	List<Observer2> observers= new ArrayList<Observer2>();
	
	public Employee(String name, String empId) {
		this.name=name;
		this.empId=empId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
		if(isActive == false) {
			// Notify Observers(HR and project manager)
			for(Observer2 observer: observers)
				observer.update(empId);
		}
	}
	
	public void attach(Observer2 observer) {
		observers.add(observer);
	}
	 
	public void detach(Observer2 observer) {
		observers.remove(observer);
	}
	
}
