package com.design.structural.adapter;

public class Paytm implements AppPaymentGateway{

	public void doXPayment(long amount) {
		System.out.println("Paytm of RS. "+amount);
	}

}
