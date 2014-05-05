package com.springinaction.chapter02.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class Juggler implements Performer,BeanNameAware,BeanFactoryAware,InitializingBean {

	private int beanBags = 3;
	
	private Juggler() {
	}

	private Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	
	public void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("JUGGLLING "+beanBags+" BEANBAGS");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println(arg0);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println(arg0.getClass().getName());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet ...");
	}
	
	public void init(){
		System.out.println("init-method ...");
	} 

}
