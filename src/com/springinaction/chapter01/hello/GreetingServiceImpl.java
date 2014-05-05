package com.springinaction.chapter01.hello;

public class GreetingServiceImpl implements GreetingService {

	private String greeting;
	
	private GreetingServiceImpl() {
	}

	private GreetingServiceImpl(String greeting) {
		this.greeting = greeting;
	}
	
	@Override
	public void sayGreeting() {
		System.out.println(greeting);
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	

}
