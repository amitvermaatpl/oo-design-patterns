package com.design.behavioral.Strategy;

/*
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * Strategy Objects + Context Object that's it.
 */
public class StrategyDemo {

	/*
	 * In Strategy pattern, we create objects which represent various strategies and a 
	 * context object whose behavior varies as per its strategy object. The strategy object 
	 * changes the executing algorithm of the context object.
	 */
	public static void main(String[] args) {
		PaymentContext context= new PaymentContext(new CreditCardPayment());
		context.doPayment();
		
		context= new PaymentContext(new DebitCardPayment());
		context.doPayment();
	}

}
