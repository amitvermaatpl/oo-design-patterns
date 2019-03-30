package com.design.structural.adapter;

public class DebitCardPay implements PaymentGateway{

	public void doPayment(String paymentType) {
		System.out.println("Pay by debit card");	
	}

}
