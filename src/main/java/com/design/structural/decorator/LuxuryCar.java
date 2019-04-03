package com.design.structural.decorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
	}
	
	public void assemble() {
		car.assemble();
		addLuxuryFeatures();
	}

	private void addLuxuryFeatures() {
		System.out.println("Adding luxury features.");		
	}

}
