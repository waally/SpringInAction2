package com.springinaction.chapter04.typical;

public class Magician implements Performer {

	private String magicWords;
	
	public Magician() {
	}

	@Override
	public void perform() {
		System.out.println(magicWords);
		System.out.println("The magic box contains ...");
	}

	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

}
