package com.design.behavioral.template;

public abstract class HouseTemplate {
	
	public final void buildHouse() {
		buildWalls();
		buildRooms();
		buildKitchen();
		buildWindows();
		System.out.println("House is built.");
	}

	private void buildWindows() {
		System.out.println("By default galss windows.");		
	}

	protected abstract void buildKitchen();

	protected abstract void buildRooms();

	protected abstract void buildWalls();
}
