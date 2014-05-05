package com.springinaction.chapter02.create;

public class PoeticJuggler extends Juggler {

	private Poem poem;

	public PoeticJuggler() {
		super();
	}
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	public PoeticJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	@Override
	public void perform() {
		super.perform();
		System.out.println("wait poem recite...");
		poem.recite();
	}
	
	
}
