package com.java.virtusa.day2;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[4];
        b = a;
        for(int i : b) {
            System.out.println(i);
        }
    }
}
