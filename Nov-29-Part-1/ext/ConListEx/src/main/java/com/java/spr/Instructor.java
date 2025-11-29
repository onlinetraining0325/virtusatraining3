package com.java.spr;

import java.util.List;

public class Instructor {

	private int id;
	private String name;
	private List<String> studentNames;
	
	public Instructor(int id, String name, List<String> studentNames) {
		super();
		this.id = id;
		this.name = name;
		this.studentNames = studentNames;
	}
	
	public void showInfo() {
		System.out.println("Id  " +id+ " Name " +name);
		for (String s : studentNames) {
			System.out.println(s);
		}
	}
}
