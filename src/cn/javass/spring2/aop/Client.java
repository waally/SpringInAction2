package cn.javass.spring2.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext(new String[]{"say.xml"});
//		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/say.xml"));
		Hello hello = (Hello)context.getBean("hello");
		System.out.println(hello.say());
	}
}
