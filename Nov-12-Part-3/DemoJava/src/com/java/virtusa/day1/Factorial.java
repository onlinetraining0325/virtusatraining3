package com.java.virtusa.day1;

import java.util.Scanner;

public class Factorial {

    public  void calc(int n) {
        int f = 1, i = 1;
        while (i <= n) {
            f = f * i;
            i++;
        }
        System.out.println("Factorial Value  " +f);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Factorial f = new Factorial();
        f.calc(n);
    }
}
