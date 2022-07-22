package com.springcore.lifecycle;

public class Laptop {
	private int price;

	public Laptop(int price) {
		super();
		this.price = price;
		System.out.println("Inside parameterized constructor");
	}

	public int getPrice() {
		System.out.println("Inside get method");
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Inside set method");
		this.price = price;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside default constructor");
	}

	@Override
	public String toString() {
		System.out.println("Inside to string method");
		return "Laptop [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
}
