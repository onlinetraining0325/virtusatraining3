package com.java.virtusa.day1;

import java.util.Scanner;

public class Calculation {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers  ");
        a = sc.nextInt();
        b = sc.nextInt();
        Calculation calculation = new Calculation();
        System.out.println("Sum is  " + calculation.sum(a, b));
        System.out.println("Sub is  " + calculation.sub(a, b));
        System.out.println("Mul is  " + calculation.mul(a, b));
    }
}
