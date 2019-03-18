package com.design.behavioral.template;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		HouseTemplate houseType = new NormalHouse();
		houseType.buildHouse();
		System.out.println("*********************");
		houseType = new WoodenHouse();
		houseType.buildHouse();
		
	}

}
