package com.java.virtusa.day2;

public class ConEx {

    int a, b;

    @Override
    public String toString() {
        return "ConEx{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    ConEx() {
        a = 5;
        b = 7;
    }
    ConEx(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        ConEx conEx = new ConEx();
        System.out.println(conEx);

        ConEx obj1 = new  ConEx(88, 122);
        System.out.println(obj1);
    }
}
