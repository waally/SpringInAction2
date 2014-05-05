package com.springinaction.chapter02.auto;

public class Instrumentalist implements Performer{
	
	public Instrumentalist() {
	}

	public Instrumentalist(String song) {
		super();
		this.song = song;
	}

	public Instrumentalist(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public Instrumentalist(String song, Instrument instrument) {
		this.song = song;
		this.instrument = instrument;
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
