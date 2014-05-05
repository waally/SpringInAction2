package com.springinaction.chapter02.fit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/springinaction/chapter02/fit/perform.xml"));
		OneManBand kenny = (OneManBand)beanFactory.getBean("hank");
		kenny.perform();
	}
}
