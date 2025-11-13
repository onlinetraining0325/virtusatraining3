package com.java.intf;

public class Quiz2 {

    public void show(Object ob) {
        if (ob=="ABC") {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        new Quiz2().show(str);
    }
}
