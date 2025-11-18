package com.java.cols;

public class Prog5 {

    public static String part(String s) {
        return s.substring(0,5);
    }

    public static void main(String[] args) {
        StringProcessor proc = Prog5::part;
        System.out.println(proc.process("Deepak Raju"));
    }
}
