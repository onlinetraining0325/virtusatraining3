package com.java.virtusa.day2;

public class EmployArray {

    public static void main(String[] args) {
        Employ[] arr = new Employ[] {
          new Employ(1, "Ankit",88323),
          new Employ(2, "Gaurav",88111),
          new Employ(3,"Islam",81222),
          new Employ(4,"Kratika",88123)
        };

        System.out.println("Employ Records are  ");
        for (Employ e : arr) {
            System.out.println(e);
        }
    }
}
