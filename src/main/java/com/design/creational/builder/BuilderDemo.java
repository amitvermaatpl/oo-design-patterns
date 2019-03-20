package com.design.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		Computer myComputer = new Computer.ComputerBuilder("intel", "16GB", "2TB")
								  .keyboard("samsung")
								  .mouse("logitech")
								  .build(); // Calling/Passing builder object in Computer.
		
		System.out.println("Computer ready with RAM= "+ myComputer.getRam());
		
		// GYM //
		
		GymPackage gym= new GymPackage.GymPackageBuilder("All Machines", "1500")
							.nutriotion("Provided")
							.trainer("Provided")
							.build();
		
		System.out.println("Gym with fee= Rs."+ gym.getFee());
		
	}

}
