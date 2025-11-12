package com.java.virtusa.day1;

import java.util.Scanner;

public class ForLoopEx2 {

    public void check(int n) {
        boolean flag = true;
        for(int i=2;i<n;i++) {
            if (n%i==0) {
                flag =false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Prime Number...");
        } else {
            System.out.println("Not Prime Number...");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value  ");
        n = sc.nextInt();
        ForLoopEx2 obj = new ForLoopEx2();
        obj.check(n);
    }
}
