package com.springcore.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.java.config")
public class JavaConfig {
	
	@Bean
	public Display getDisplay() {
		return new Display();
	}
	
	@Bean(name = {"s1", "temp", "s2"})
	public Student getStudent() {
		Student student = new Student(getDisplay());
		return student;
	}

}
