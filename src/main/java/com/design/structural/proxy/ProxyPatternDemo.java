package com.design.structural.proxy;

/*
 * Provide a surrogate or placeholder for another object to control access to it.
 * 
 * Let’s say we have a class that can run some command on the system. Now if we are using it, 
 * its fine but if we want to give this program to a client application, it can have severe issues
 * because client program can issue command to delete some system files or change some settings that
 * you don’t want.
 * 
 * Here a proxy class can be created to provide controlled access of the program.
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		try {
			Internet internet = new RealInternet();
			internet.connectTo("facebook.com");
			
			// Solve the above problem by using proxy
			Internet pinternet = new RealInternetProxy();
			pinternet.connectTo("facebook.com");
		}catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
