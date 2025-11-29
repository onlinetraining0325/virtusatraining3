package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/bean.xml");
		HelloWorld hw1 = (HelloWorld)ctx.getBean("beanHelloWorld");
		HelloWorld hw2 = (HelloWorld)ctx.getBean("beanHelloWorld");
		System.out.println(hw1);
		System.out.println(hw2);
	}
}
