package com.springcore.java.config;

import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Student {
	private Display display;
	
	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public void study() {
		System.out.println("Student is studying");
	}

	public Student(Display display) {
		super();
		this.display = display;
	}
}
