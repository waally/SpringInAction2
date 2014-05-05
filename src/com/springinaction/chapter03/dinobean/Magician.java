package com.springinaction.chapter03.dinobean;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable("harry")
public class Magician implements Performer {

	private String magicWords;
	
	private MagicBox magicBox;
	
	public Magician() {
	}

	@Override
	public void perform() {
		System.out.println(magicWords);
		System.out.println("The magic box contains ...");
		System.out.println(magicBox.getContents());
	}

	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}

}
