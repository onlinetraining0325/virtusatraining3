package com.java.virtusa.day2;

public class StrTest {
    public static void main(String[] args) {
        String names = "Indu Gaurav Kratika Subham Anusree Chandra";
        String[] namesArray = names.split(" ");
        for (String name : namesArray) {
            System.out.println(name);
        }
    }
}
