package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;

@Component("akansh")
public class Juggler implements Performer {
	@Value("4")
	private int beanBags;
	@Override
	public void perform() throws PerformanceException {
		if(beanBags<3)  {
			throw new PerformanceException("fewer bean bags");
		}
		else {
			System.out.println("juggler juggling bean bags "+beanBags);
		}

	}

}
