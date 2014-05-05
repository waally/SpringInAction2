package com.springinaction.chapter03.method;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/springinaction/chapter03/method/perform.xml"));
		Performer harry = (Performer)beanFactory.getBean("harry");
		harry.perform();
	}
	
}
