package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Numbers {
	@Value("#{25 + 30}")
	private int num1;
	@Value("#{8>6 ? 36 : 46}")
	private int num2;
	
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double sq;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double PI;
	
	@Value("#{ new java.lang.String('Rajat Gupta') }")
	private String name;
	
	@Value("#{ true }")
	private boolean isActive;
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Numbers [num1=" + num1 + ", num2=" + num2 + ", sq=" + sq + ", PI=" + PI + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}
	public double getSq() {
		return sq;
	}
	public void setSq(double sq) {
		this.sq = sq;
	}
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
