package com.java.virtusa.day2;

public class OverloadEx2 {

    public int sum() {
        return 5;
    }

    public int sum(int x) {
        return x + 5;
    }
    public int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        OverloadEx2 obj = new  OverloadEx2();
        System.out.println(obj.sum());
        System.out.println(obj.sum(5));
        System.out.println(obj.sum(5,8));
    }
}
