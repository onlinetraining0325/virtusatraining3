package com.java.virtusa.day1;

import java.util.Scanner;

public class CaseExample4 {
    public void show(int year, int month) {
        switch(month) {
            case 1,3,5,7,8,10,12 -> System.out.println("Month Has  31 Days...");
            case 4,6,9,11 -> System.out.println("Month has 30 Days");
            case 2 -> {
                if (year%4==0) {
                    System.out.println("Its Leap Year you have 29 days...");
                } else {
                    System.out.println("Its Not Leap Year it has 28 Days only...");
                }
            }
            default -> System.out.println("Invalid Month...");
        }
    }
    public static void main(String[] args) {
        int year,month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year and Month   ");
        year = sc.nextInt();
        month = sc.nextInt();
        CaseExample4 obj = new CaseExample4();
        obj.show(year,month);
    }
}
