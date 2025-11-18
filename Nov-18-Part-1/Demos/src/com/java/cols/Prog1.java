package com.java.cols;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akshitha","Lokesh","Arpita","Subham","Gaurav",
                "Lokesh","Arpita","Meghana","Subham");
        System.out.println("Eliminate Duplicates and Print As    ");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("Sorted Data w.r.t.    ");
        list.stream().distinct().sorted().forEach(System.out::println);
    }
}
