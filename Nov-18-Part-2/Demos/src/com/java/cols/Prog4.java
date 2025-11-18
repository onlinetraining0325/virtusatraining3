package com.java.cols;



public class Prog4 {
    public static String toUpper(String s) {
        return s.toUpperCase();
    }
    public static String toLower(String s) {
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        StringProcessor processor = Prog4::toUpper;
        System.out.println(processor.process("Harsh"));
        processor = Prog4::toLower;
        System.out.println(processor.process("Harsh"));
    }
}
