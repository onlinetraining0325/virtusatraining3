package com.java.virtusa.day1;

import java.util.Scanner;

public class CaseExample5 {
    public int show(int year, int month) {
        int result = switch(month) {
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> {
                if (year%4==0) {
                    System.out.println("Its Leap Year you have 29 days...");
                    yield 29;
                } else {
                    System.out.println("Its Not Leap Year it has 28 Days only...");
                    yield 28;
                }
            }
            default -> {
                System.out.println("Invalid Month...");
                yield 0;
            }
        };
        return result;
    }
    public static void main(String[] args) {
        int year,month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year and Month   ");
        year = sc.nextInt();
        month = sc.nextInt();
        CaseExample5 obj = new CaseExample5();
        System.out.println(obj.show(year,month));
    }
}
