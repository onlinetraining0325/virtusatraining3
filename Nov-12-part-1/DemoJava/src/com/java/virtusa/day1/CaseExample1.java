package com.java.virtusa.day1;

import java.util.Scanner;

public class CaseExample1 {

    public void show(int choice) {
        switch(choice) {
            case 1 :
                System.out.println("Hi I am Akshitha...");
                break;
            case 2 :
                System.out.println("Hi I am Lokesh...");
                break;
            case 3 :
                System.out.println("Hi I am Subham...");
                break;
            case 4 :
                System.out.println("Hi I am Priya...");
                break;
            case 5 :
                System.out.println("Hi I am Harsh...");
                break;
        }
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice   ");
        choice = sc.nextInt();
        CaseExample1 c = new CaseExample1();
        c.show(choice);
    }
}
