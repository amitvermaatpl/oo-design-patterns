package com.design.structural.adapter;

/*
 * The adapter design pattern is one of the structural design patterns and it’s used so that two unrelated 
 * interfaces can work together. The object that joins these unrelated interfaces is called an Adapter. 
 * 
 * Adapter: joins two unrelated interfaces together.
 * 
 * This pattern involves a single class which is responsible to join functionalities of independent or incompatible 
 * interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a
 * laptop. Ever tried to use a your camera memory card in your laptop. You cannot use it directly simply because there 
 * is no port in laptop which accept it. You must use a compatible card reader. 
 */
public class AdapterDemo {

	public static void main(String[] args) {
		PaymentGateway pay = new DebitCardPay();
		pay.doPayment("");
		
		pay= new PaymentAdapter(new Paytm());
		pay.doPayment("="); // See the paytm Adapter; READ book 

	}

	// https://medium.com/@ssaurel/implement-the-adapter-design-pattern-in-java-f9adb6a8828f
	
}
