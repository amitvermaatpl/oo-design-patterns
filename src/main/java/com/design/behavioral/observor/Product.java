package com.design.behavioral.observor;

import java.util.ArrayList;
import java.util.List;

/* If product is available notify the customers */
public class Product{

	List<Observer> customers = new ArrayList<Observer>();
	String availability;
	
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	public void attach(Observer customer) {
		customers.add(customer);
	}
	
	public void detach(Observer customer) {
		customers.remove(customer);
	}
	
	public void notifyObservers() {
		for(Observer customer : customers) {
			customer.update();
		}
	}
}
