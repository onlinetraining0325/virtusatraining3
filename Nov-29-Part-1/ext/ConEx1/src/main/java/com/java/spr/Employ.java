package com.java.spr;

public class Employ {

	private int empno;
	private String name;
	private double basic;
	private Address address;
	public Employ(int empno, String name, double basic, Address address) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + ", address=" + address + "]";
	}
	
	
}
