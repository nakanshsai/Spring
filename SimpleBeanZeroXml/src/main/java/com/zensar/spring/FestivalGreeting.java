package com.zensar.spring;

import org.springframework.stereotype.Component;

/**
 * @author akansh_sai
 *
 */
@Component("festival")			//decorative annotation no need to create bean definition
public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {
	
		return "happy life";
	}
	public FestivalGreeting() {
		
		System.out.println("festival greeting is created");
	}

}
