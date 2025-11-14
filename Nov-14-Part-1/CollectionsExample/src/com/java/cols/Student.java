package com.java.cols;

public class Student {

    int sno;
    String sname;
    String city;
    double cgp;

    public Student() { }
    public Student(int sno, String sname, String city, double cgp) {
        this.sno = sno;
        this.sname = sname;
        this.city = city;
        this.cgp = cgp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", city='" + city + '\'' +
                ", cgp=" + cgp +
                '}';
    }
}
