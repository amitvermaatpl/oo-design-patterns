package com.design.behavioral.observor;

import java.util.ArrayList;
import java.util.List;

/* If product is available notify the customers */
public class Product{

	List<Observer1> customers = new ArrayList<Observer1>();
	String availability;
	
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	public void attach(Observer1 customer) {
		customers.add(customer);
	}
	
	public void detach(Observer1 customer) {
		customers.remove(customer);
	}
	
	public void notifyObservers() {
		for(Observer1 customer : customers) {
			customer.update();
		}
	}
}
