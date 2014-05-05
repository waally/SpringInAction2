package com.springinaction.chapter02.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPost implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName)throws BeansException {
		System.out.println("BeanPostProcessor.postProcessAfterInitialization 正在预处理！");
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)throws BeansException {
		System.out.println("BeanPostProcessor.postProcessBeforeInitialization 正在预处理！");
		return bean;

	}
}