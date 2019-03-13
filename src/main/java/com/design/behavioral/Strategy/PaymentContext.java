package com.design.behavioral.Strategy;

public class PaymentContext {
	Strategy paymentStrategy;
	
	PaymentContext(Strategy paymentStrategy){
		this.paymentStrategy=paymentStrategy;
	}
	public void doPayment() {
		paymentStrategy.doPayement();
	}
}
