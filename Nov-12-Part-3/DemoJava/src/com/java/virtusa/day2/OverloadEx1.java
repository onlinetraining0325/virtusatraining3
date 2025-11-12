package com.java.virtusa.day2;

public class OverloadEx1 {

    public void show(int x) {
        System.out.println("Show Method w.r.t. Integer " +x);
    }

    public void show(String x) {
        System.out.println("Show Method w.r.t. String " +x);
    }

    public void show(double x) {
        System.out.println("Show Method w.r.t. Double " +x);
    }
    public static void main(String[] args) {
        OverloadEx1 ob = new OverloadEx1();
        ob.show(12);
        ob.show(12.5);
        ob.show("Virtusa");
    }
}
