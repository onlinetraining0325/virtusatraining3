package com.example.demo;

public class Employ {

    private int empno;
    private String name;
    private double salary;

    public Employ() {}

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employ(int empno, String name, double salary) {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }
}
