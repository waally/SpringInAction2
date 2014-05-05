package com.springinaction.chapter03.method;

public class Magician implements Performer {

	private String magicWords;
	
	private MagicBox magicBox;
	
	public Magician() {
	}

	@Override
	public void perform() {
		System.out.println(magicWords);
		System.out.println("The magic box contains ...");
		System.out.println(getMagicBox().getContents());
	}

	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}

	public MagicBox getMagicBox() {
		return magicBox;
	}
	
}
