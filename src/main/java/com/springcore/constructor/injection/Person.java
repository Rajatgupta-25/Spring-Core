package com.springcore.constructor.injection;

public class Person {
	private int id;
	private String name;
	private Certi certi;
	public Person(int id, String name, Certi certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return this.name + ":" + this.id + "certi:" + this.certi.name;
	}
}
