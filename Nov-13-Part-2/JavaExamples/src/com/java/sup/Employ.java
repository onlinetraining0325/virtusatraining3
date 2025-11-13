package com.java.sup;

public class Employ {

    private int empno;
    private String name;
    private double basic;

    public Employ(int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    public Employ() {}

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                '}';
    }
}
