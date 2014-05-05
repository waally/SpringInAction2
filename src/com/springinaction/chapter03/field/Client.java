package com.springinaction.chapter03.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/chapter03/field/perform.xml");
		Contact contact = (Contact)context.getBean("contact");
		System.out.println(contact.getPhoneNumber());
	}
	
}
