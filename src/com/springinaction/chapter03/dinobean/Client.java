package com.springinaction.chapter03.dinobean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/chapter03/dinobean/perform.xml");
		Magician performer = new Magician();//(Magician) context.getBean("harry");
		System.out.println(performer.getClass().getName());
		performer.perform();
	}
	
}
