package com.java.gen;

import java.util.Objects;

public class Employ {

    int empno;
    String name;
    double basic;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employ employ = (Employ) o;
        return empno == employ.empno && Double.compare(basic, employ.basic) == 0 && Objects.equals(name, employ.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, name, basic);
    }

    public Employ() { }
    public Employ(int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                '}';
    }
}
