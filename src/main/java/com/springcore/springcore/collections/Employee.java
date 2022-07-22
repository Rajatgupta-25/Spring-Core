package com.springcore.springcore.collections;
import java.util.*;

public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> list, Set<String> address, Map<String, String> map) {
		super();
		this.name = name;
		this.list = list;
		this.address = address;
		this.map = map;
	}
	private String name;
	private List<String> list;
	private Set<String> address;
	private Map<String, String> map;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", list=" + list + ", address=" + address + ", map=" + map + "]";
	}
}
