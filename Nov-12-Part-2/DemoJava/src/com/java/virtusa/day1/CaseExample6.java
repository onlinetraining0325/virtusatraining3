package com.java.virtusa.day1;

import java.util.Scanner;

public class CaseExample6 {

    public String show(int dayNo) {
        String result = switch (dayNo) {
            case 1 : yield  "Sunday";
            case 2 : yield  "Monday";
            case 3 : yield  "Tuesday";
            case 4 : yield  "Wednesday";
            case 5 : yield  "Thursday";
            case 6 : yield  "Friday";
            case 7 : yield  "Saturday";
            default:
               yield "Invalid Value";
        };
        return result;

    }
    public static void main(String[] args) {
        int dayNo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day No  ");
        dayNo = sc.nextInt();
        CaseExample6 obj = new CaseExample6();
        System.out.println(obj.show(dayNo));
    }
}
