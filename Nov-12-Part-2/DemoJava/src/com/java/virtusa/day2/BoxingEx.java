package com.java.virtusa.day2;

public class BoxingEx {
    public static void main(String[] args) {
        int a = 10;
        double b=12.4;
        String str = "Virtusa";
        /* Implement Boxing */
        Object ob1 = a;
        Object ob2 = b;
        Object ob3 = str;

        /* Implement Unboxing */
        int a1 = (Integer)ob1;
        double b1 = (Double)ob2;
        String s1 = (String)ob3;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(s1);
    }
}
