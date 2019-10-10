package com.zensar.spring.performers;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Map<Instrument,String> instrumentSongMap ;
	
	

	
	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}




	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}




	@Override
	public void perform() {
		
		System.out.println("instrumentalist is playing song");
		for( Map.Entry<Instrument, String> ism:instrumentSongMap.entrySet() ) {
			
			System.out.println("song played is "+ism.getValue()+"by");
			ism.getKey().play();
		}
	}
	

}
