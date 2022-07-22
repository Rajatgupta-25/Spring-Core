package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address2")
	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

//	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}
}
