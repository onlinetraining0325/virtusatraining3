package com.java.jdk8;

interface IGreeting {
    void greet();
}

public class LambdaExpr1 {
    public static void main(String[] args) {

        IGreeting obj1 = () -> System.out.println("Good Morning");
        IGreeting obj2 = () -> System.out.println("Good Afternoon");
        IGreeting obj3 = () -> System.out.println("Good Evening");

        obj1.greet();
        obj2.greet();
        obj3.greet();
    }
}
