package com.design.behavioral.template;

public class WoodenHouse extends HouseTemplate{

	@Override
	protected void buildKitchen() {
		System.out.println("Wooden kitchen");
	}

	@Override
	protected void buildRooms() {
		System.out.println("Wooden rooms");
		
	}

	@Override
	protected void buildWalls() {
		System.out.println("Walls coated with wooden prints.");		
	}

}
