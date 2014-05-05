package com.springinaction.chapter02.fit;

import java.util.Collection;

public class OneManBand implements Performer {
	
	public OneManBand() {
	}

	@Override
	public void perform() {
		for(Instrument instrument:instruments)
			instrument.play();
	}
	
	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	
}
