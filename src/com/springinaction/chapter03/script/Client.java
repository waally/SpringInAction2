package com.springinaction.chapter03.script;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/chapter03/script/perform.xml");
		Cocount cocount = (Cocount) context.getBean("cocount");
		while(true){
			cocount.drinkThemBothUp();
			Thread.sleep(2000);
		}
	}
	
}
