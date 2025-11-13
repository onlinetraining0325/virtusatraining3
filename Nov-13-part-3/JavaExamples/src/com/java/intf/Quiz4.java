package com.java.intf;

public class Quiz4 {

    public void show(double x) {
        System.out.println("Double  " +x);
    }

    public void show(Object x) {
        System.out.println("Object  " +x);
    }
    public static void main(String[] args) {
        int x = 4;
        new Quiz4().show(4);
    }
}
