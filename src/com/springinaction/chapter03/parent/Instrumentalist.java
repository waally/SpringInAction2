package com.springinaction.chapter03.parent;

public class Instrumentalist implements Performer{
	
	public Instrumentalist() {
	}

	@Override
	public void perform() {
		System.out.println("play song "+song+":");
		instrument.play();
	}
	
	private String song;
	
	private Instrument instrument;

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	

}
