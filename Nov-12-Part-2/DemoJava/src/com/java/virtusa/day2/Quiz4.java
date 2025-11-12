package com.java.virtusa.day2;

public class Quiz4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a;
        b[3]=44;
        System.out.println(a[3]  + "  " +b[3]); // 44 44
// Both points to same memory location
    }
}
