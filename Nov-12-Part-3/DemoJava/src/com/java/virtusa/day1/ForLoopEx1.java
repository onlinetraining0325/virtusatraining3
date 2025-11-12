package com.java.virtusa.day1;

import java.util.Scanner;

public class ForLoopEx1 {

    public void show(int n) {
        for(int i=1;i<=n;i++) {
            if (n%i==0) {
                System.out.println("Factor  " +i);
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value  ");
        n = sc.nextInt();
        ForLoopEx1 obj = new ForLoopEx1();
        obj.show(n);
    }
}
