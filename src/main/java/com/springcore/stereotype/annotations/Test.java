package com.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/config.xml");
		Person p1 = context.getBean("obj", Person.class);
		System.out.println(p1);
		
		System.out.println(p1.getCity());
		System.out.println(p1.getCity().getClass().getName());
	}

}
