package com.springcore.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student student = context.getBean("firstStudent", Student.class);
		/*
		 * Student student = context.getBean("temp", Student.class); 
		 * Student student = context.getBean("s2", Student.class);
		 * 
		 */
		
		//In case where name={} not defined in @Bean
//		Student student = context.getBean("getStudent", Student.class);
		
		Student student = context.getBean("s1", Student.class);
		
		System.out.println(student);
		student.study();
		student.getDisplay().dis();
	}

}
