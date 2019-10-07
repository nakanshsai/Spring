package com.zensar.spring;

public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {
	
		return "happy life";
	}
	public FestivalGreeting() {
		
		System.out.println("festival greeting is created");
	}

}
