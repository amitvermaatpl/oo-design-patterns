package com.design.behavioral.observor;

/*
 * OBSERVER Pattern: says, if one object is modified, its dependent objects are to be notified automatically.
 */
public class ObserverDemo {

	/*
	 * USE_CASE: If product available then notify customers.
	 */
	public static void main(String[] args) {

		Customer amit = new Customer("Amit");
		Customer john = new Customer("John");
		
		Product p= new Product();
		p.attach(amit);
		p.attach(john);
		
		//p.detach(john);
		p.setAvailability("Product is avaialble");
	}

}

// REFERENCE //
/* 
 *  https://dzone.com/articles/observer-design-pattern-java

	https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/

	https://www.tutorialspoint.com/design_pattern/observer_pattern.htm	
 */

