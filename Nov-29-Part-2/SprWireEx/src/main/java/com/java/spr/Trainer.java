package com.java.spr;

import java.util.List;

public class Trainer {

	private String trainerName;
	private String location;
	private List<Student> studentList;
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void showAllInfo() {
		System.out.println("Trainer Name  " +trainerName);
		System.out.println("Location  " +location);
		System.out.println("Students List is  ");
		for (Student s : studentList) {
			System.out.println(s);
		}
	}
}
