package com.java.virtusa.day2;

public class Test {
   static {
       System.out.println("Test static block");
   }

   Test() {
       System.out.println("Test constructor");
   }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
