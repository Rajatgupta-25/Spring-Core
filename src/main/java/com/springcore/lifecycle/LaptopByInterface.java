package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LaptopByInterface implements InitializingBean, DisposableBean {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LaptopByInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LaptopByInterface(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "LaptopByInterface [price=" + price + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy method for interface lifecycle");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init method for interface lifecycle");
	}
}
