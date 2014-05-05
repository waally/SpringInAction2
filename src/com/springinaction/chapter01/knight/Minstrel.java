package com.springinaction.chapter01.knight;

import java.util.logging.Logger;

public class Minstrel {

	private static final Logger SONG = Logger.getLogger(Minstrel.class.getName());
	
	public void singBefore(){
		SONG.info("the kniht is brave!");
		System.out.println("the kniht is brave!");
	}
	
	public void afterBefore(){
		SONG.info("the kniht is embark quest!");
		System.out.println("the kniht is embark quest!");
	}
}
