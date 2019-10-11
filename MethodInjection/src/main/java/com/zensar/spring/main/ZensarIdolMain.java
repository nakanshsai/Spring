package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performer.Performer;



public class ZensarIdolMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performer.xml");
		Performer p = ctx.getBean("dynamo",Performer.class);
		p.perform();
	}

}
