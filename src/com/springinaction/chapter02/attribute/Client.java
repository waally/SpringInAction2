package com.springinaction.chapter02.attribute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/springinaction/chapter02/attribute/perform.xml"));
		Instrumentalist kenny = (Instrumentalist)beanFactory.getBean("kenny");
		kenny.perform();
	}
}
