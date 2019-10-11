package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.spring.exceptions.PerformanceException;
import com.zensar.spring.performers.Performer;
import com.zensasr.spring.config.PerformerConfig;



public class ZensarIdolMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p = ctx.getBean("akansh", Performer.class);
		try {
			p.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
