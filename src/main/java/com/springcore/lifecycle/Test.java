package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Laptop l = (Laptop)context.getBean("laptop");
		System.out.println(l);
		context.registerShutdownHook();
		
		LaptopByInterface lb = (LaptopByInterface)context.getBean("lb");
		System.out.println(lb);
		
		LaptopByAnnotation la = (LaptopByAnnotation)context.getBean("la");
		System.out.println(la);
	}

}
