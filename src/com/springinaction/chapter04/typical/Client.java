package com.springinaction.chapter04.typical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/chapter04/typical/perform.xml");
		Performer harry = (Performer)context.getBean("harry");
		harry.perform();
	}
	
}
