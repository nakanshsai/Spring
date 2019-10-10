package com.zensar.spring;

import org.springframework.stereotype.Component;

/**
 * @author akansh_sai
 *
 */
@Component("anniversary")
public class AnniversaryGreeting implements Greeting {

	@Override
	public String greet() {
		
		return "sad life ";
	}
	public AnniversaryGreeting() {
		
		System.out.println("anniversary greeting is created");
	}
}
