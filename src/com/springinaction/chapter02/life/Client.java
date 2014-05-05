package com.springinaction.chapter02.life;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/springinaction/chapter02/life/perform.xml"));
		Performer performer = (Performer)beanFactory.getBean("performer");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/chapter02/perform.xml");
//		Performer performer = (Performer)context.getBean("performer");
		performer.perform();
		performer.perform();
	}
}
