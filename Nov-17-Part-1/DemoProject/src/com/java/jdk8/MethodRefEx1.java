package com.java.jdk8;

import java.util.Scanner;

@FunctionalInterface
interface ICalc {
    int calc(int a, int b);
}

class Calculation {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }
}
public class MethodRefEx1 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 Numbers  : ");
        a =  input.nextInt();
        b =  input.nextInt();
        Calculation calc = new Calculation();
        ICalc obj1 = calc::sum;
        System.out.println("Sum is: " + obj1.calc(a, b));
        obj1 = calc::sub;
        System.out.println("Sub is: " + obj1.calc(a, b));
        obj1 = calc::mult;
        System.out.println("Mult is: " + obj1.calc(a, b));
    }
}
