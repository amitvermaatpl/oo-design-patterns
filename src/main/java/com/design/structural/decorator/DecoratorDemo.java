package com.design.structural.decorator;

/*
 * Decorator pattern allows a user to add new functionality to an existing object without altering
 * its structure. This pattern is used to modify the functionality of an object at runtime.
 * 
 * We can’t add any new functionality of remove any existing behavior at runtime – this is when 
 * Decorator pattern comes into picture.
 */
public class DecoratorDemo {

	public static void main(String[] args) {
		Game g1= new FightingGame();
		g1.play();
		
		Game g2 = new IntroGameDecorator(new RacingGame());
		g2.play();
		
		Car sportsCar = new LuxuryCar(new BasicCar());
		sportsCar.assemble();
		
		Printer p = new ColorPrinter(new BasicPrinter());
		p.print();
	}

}
