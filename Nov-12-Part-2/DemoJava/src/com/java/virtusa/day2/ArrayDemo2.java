package com.java.virtusa.day2;

public class ArrayDemo2 {

    public void show() {
        String[] names = new String[] {
                "Lokesh","Subham","Ankit",
                "Indu","Akshitha","Meghana"
        };
        for(String name : names) {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        ArrayDemo2 obj = new ArrayDemo2();
        obj.show();
    }
}
