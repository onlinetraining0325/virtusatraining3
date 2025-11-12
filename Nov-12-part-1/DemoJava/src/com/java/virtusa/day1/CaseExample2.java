package com.java.virtusa.day1;

import java.util.Scanner;

public class CaseExample2 {

    public void show(String sname) {
        switch (sname) {
            case "Subham" :
                System.out.println("Hi I am Subham Pathak...");
                break;
            case "Lokesh" :
                System.out.println("Hi I am Lokesh Punwani...");
                break;
            case "Akshitha" :
                System.out.println("Hi I am Akshitha Merugu...");
                break;
            case "Priya" :
                System.out.println("Hi I am Priya Darshini...");
                break;
            case "Chandra" :
                System.out.println("Hi I am Chandra Sekhar...");
                break;
        }
    }
    public static void main(String[] args) {
        String sname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name   ");
        sname = sc.next();
        CaseExample2 obj = new CaseExample2();
        obj.show(sname);
    }
}
