package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class Trumpet implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("trumpet is playing");
	}

}
