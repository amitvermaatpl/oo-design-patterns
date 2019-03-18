package com.design.behavioral.observor;

public class ObserverDemo2 {

	public static void main(String[] args) {
		Employee amit = new Employee("Amit Verma", "08401");	
		Employee ankur = new Employee("Ankur", "07601");
		
		// Notify the observers(managers) if some of their employee left the organization //
		HRManager lokesh = new HRManager();
		ProjectManager tanmay = new ProjectManager();
		
		amit.attach(lokesh);amit.attach(tanmay);
		ankur.attach(lokesh);ankur.attach(tanmay);
		
		amit.setActive(true);
		ankur.setActive(false);
	}

}
