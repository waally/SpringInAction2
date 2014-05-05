package cn.javass.spring2.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAfter {

	@After(value = "execution(* *(..))")
	public void after(){
		System.out.println("after ......");
	}
}
