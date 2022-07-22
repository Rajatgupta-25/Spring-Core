package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/config.xml");
		
		// By writing Employee.class we don't have to explicitly type cast the object
		/*
		 * Employee emp1 = context.getBean("emp1", Employee.class);
		 * 
		 * System.out.println(emp1);
		 */
		
		
		Employee emp2 = context.getBean("emp2", Employee.class);
		
		System.out.println(emp2);

	}

}
