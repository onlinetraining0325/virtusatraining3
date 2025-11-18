package com.java.cols;


@FunctionalInterface
interface ICalculator {
    int calc(int a, int b);

    default void info() {
        System.out.println("Calculations are not implemented yet");
    }

    static void greet() {
        System.out.println("Good Morning...");
    }
}

public class Prog3 {
    public static void main(String[] args) {
        ICalculator add = (a, b) -> a + b;
        add.info();
        System.out.println("Addition is: " + add.calc(10, 20));
        ICalculator.greet();
    }
}
