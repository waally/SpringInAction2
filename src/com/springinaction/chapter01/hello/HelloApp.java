package com.springinaction.chapter01.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/hello.xml"));
		GreetingService greetingService = (GreetingService)beanFactory.getBean("greetingService2");
		greetingService.sayGreeting();
	}
}
