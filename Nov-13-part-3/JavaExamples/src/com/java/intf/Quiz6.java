package com.java.intf;

class Demo {
    static {
        System.out.println("First");
    }
}
public class Quiz6 {

    static {
        System.out.println("Bye");
    }

    Quiz6() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Quiz6();
    }
}
