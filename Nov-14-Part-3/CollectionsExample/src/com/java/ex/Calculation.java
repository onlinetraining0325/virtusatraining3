package com.java.ex;

import java.util.Scanner;

public class Calculation {

    public void calc(int a, int b) throws NegativeException, NumerZeroException {
        if (a < 0 || b < 0) {
            throw new NegativeException("Negative Nos Not Allowed...");
        } else if (a == 0 || b == 0) {
            throw new NumerZeroException("Zero is Invalid Value...");
        } else {
            int c = a+b;
            System.out.println("Sum is  " +c);
        }
    }
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 Numbers  ");
        a = input.nextInt();
        b = input.nextInt();
        Calculation obj = new Calculation();
        try {
            obj.calc(a,b);
        } catch (NegativeException | NumerZeroException e) {
            System.err.println(e.getMessage());
        }
    }
}
