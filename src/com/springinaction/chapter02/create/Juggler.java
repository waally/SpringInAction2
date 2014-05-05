package com.springinaction.chapter02.create;


public class Juggler implements Performer{

	private int beanBags = 3;
	
	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	
	public void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("JUGGLLING "+beanBags+" BEANBAGS");
	}


}
