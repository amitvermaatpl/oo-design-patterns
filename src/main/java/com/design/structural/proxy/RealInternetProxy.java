package com.design.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealInternetProxy implements Internet{
	
	private RealInternet internet = new RealInternet();
	private static List<String> bannedSites;
	
	static {
		bannedSites = new ArrayList<String>(); 
		bannedSites.add("facebook.com");
		bannedSites.add("twitter.com");
		bannedSites.add("instagram.com");
		bannedSites.add("youtube.com");
	}
	
	public void connectTo(String site) throws Exception {
		if(bannedSites.contains(site.toLowerCase())) {
			throw new Exception("Access Denied");
		}
		internet.connectTo("Coonecting to "+ site);		
	}

}
