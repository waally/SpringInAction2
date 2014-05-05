package com.springinaction.chapter03.script;

public class Cocount {

	private Lime lime;
	
	public void setLime(Lime lime) {
		this.lime = lime;
	}

	public void drinkThemBothUp(){
		System.out.println("01010101");
		lime.drink();
	}
}
