package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortExample1 {
    public static void main(String[] args) {
        SortedSet names = new TreeSet();
        names.add("Karthik");
        names.add("Shaili");
        names.add("Kratika");
        names.add("Harsh");
        names.add("Lokesh");
        names.add("Gaurav");
        names.add("Bharathi");
        names.add("Priya");

        System.out.println("Sorted Data  ");

        for(Object name : names){
            System.out.println(name);
        }
    }
}
