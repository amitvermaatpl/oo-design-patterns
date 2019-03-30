package com.design.structural.adapter;


/*
 * ADAPTER:  Two make two in-compatible interfaces work together.
 * 
 * Adapter implements the expected interface(i.e. PaymentGateway) and
 * keeps a reference to the object(i.e. AppPaymentGateway) you want to reuse. 
 */
public class PaymentAdapter implements PaymentGateway{

	AppPaymentGateway gateway;
	
	public PaymentAdapter(AppPaymentGateway gateway) {
		this.gateway =gateway;
	}

	public void doPayment(String paymentType) {
		gateway.doXPayment(40);		
	}
	// https://stackify.com/design-patterns-explained-adapter-pattern-with-code-examples/

}
