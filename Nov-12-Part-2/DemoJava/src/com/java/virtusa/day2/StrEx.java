package com.java.virtusa.day2;

public class StrEx {
    public static void main(String[] args) {
        String str = "Welcome to Java Programming...From Virtusa...";
        System.out.println("Length of String  " +str.length());
        System.out.println("First Occurrence of Char 'o' " +str.indexOf("o"));
        System.out.println("Char at 5th position  " +str.charAt(5));
        System.out.println("Lower Case String  " +str.toLowerCase());
        System.out.println("Upper Case String  " +str.toUpperCase());
        String s1="Ankit", s2="Bharathi",s3="Ankit",s4="Gaurav";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s2.compareTo(s1));
        System.out.println("Part of String  " +str.substring(5,10));
        System.out.println("Replaced String  " +str.replace("Java","React"));
    }
}
