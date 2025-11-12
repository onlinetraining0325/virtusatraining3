package com.java.virtusa.day1;

public class LoopExample1 {

    public void show(int n) {
        int i = 0;
        while(i < n) {
            System.out.println("Welcome to Java Programming...");
            i++;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        LoopExample1 obj = new LoopExample1();
        obj.show(n);
    }
}
