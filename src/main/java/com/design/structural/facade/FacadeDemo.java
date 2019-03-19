package com.design.structural.facade;

/*
 * Facade design pattern is used to help client applications to easily interact with the system.
 * 
 * As the name suggests, it means the face of the building. The people walking past the road can only 
 * see this glass face of the building. They do not know anything about it, the wiring, the pipes and
 * other complexities. It hides all the complexities of the building and displays a friendly face. 
 */
public class FacadeDemo {

	/*
	 * Facade design pattern can be applied at any point of development, usually when the number 
	 * of interfaces grow and system gets complex.
	 * 
	 * It hides the complexities of the system and provides an interface to the client from where 
	 * the client can access the system.
	 */
	public static void main(String[] args) {
		ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
		
		reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
	}

}
