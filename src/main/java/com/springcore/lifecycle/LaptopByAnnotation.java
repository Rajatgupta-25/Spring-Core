package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LaptopByAnnotation {
	private int price;

	@Override
	public String toString() {
		return "LaptopByAnnotation [price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@PostConstruct
	public void start() {
		System.out.println("Init method for annotation");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method for annotaion");
	}
}
