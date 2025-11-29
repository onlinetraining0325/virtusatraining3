package com.java.spr;

import java.util.List;

public class Faculty {

	private String facultyName;
	private List<Student> studentsList;
	
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public List<Student> getStudentsList() {
		return studentsList;
	}
	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}
	
	public void teaching() {
		System.out.println("Faculty  " +facultyName + " Sharing lunch with Students");
		for (Student student : studentsList) {
			student.display();
		}
	}
}
