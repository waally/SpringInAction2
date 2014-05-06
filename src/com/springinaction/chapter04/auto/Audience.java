package com.springinaction.chapter04.auto;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	public Audience() {
	}

	@Pointcut("execution(* *.perform(..))")
	public void performance(){}
	
	@After("performance()")
	public void takeSeats(){
		System.out.println("seat down");
	}
	
}
