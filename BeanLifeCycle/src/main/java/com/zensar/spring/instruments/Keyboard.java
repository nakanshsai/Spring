package com.zensar.spring.instruments;

public class Keyboard implements Instrument {
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("ping ding");
	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("keyboard is tune");
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("keyboard is clean");
	}

}
