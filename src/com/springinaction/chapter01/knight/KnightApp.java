package com.springinaction.chapter01.knight;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class KnightApp {

	public static void main(String[] args) throws QuestFailedException {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/knight.xml"));
		Knight knight = (Knight) beanFactory.getBean("knight");
		System.out.println(knight.embarkOnQuest());
	}
}
