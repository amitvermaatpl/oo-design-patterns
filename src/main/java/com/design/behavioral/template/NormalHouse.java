package com.design.behavioral.template;

public class NormalHouse extends HouseTemplate{

	@Override
	protected void buildKitchen() {
		System.out.println("Normal kitchen");
	}

	@Override
	protected void buildRooms() {
		System.out.println("Normal rooms");
		
	}

	@Override
	protected void buildWalls() {
		System.out.println("Normal walls.");		
	}
	
}
