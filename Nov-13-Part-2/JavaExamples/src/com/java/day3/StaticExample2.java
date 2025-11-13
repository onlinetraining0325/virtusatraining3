package com.java.day3;

public class StaticExample2 {

    static int count;

    public void increment() {
        count++;
    }

    public void show() {
        System.out.println(" count =  " +count);
    }
    public static void main(String[] args) {
        StaticExample2 obj1 = new StaticExample2();
        StaticExample2 obj2 = new StaticExample2();
        StaticExample2 obj3 = new StaticExample2();

        obj1.increment();
        obj2.increment();
        obj3.increment();

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
