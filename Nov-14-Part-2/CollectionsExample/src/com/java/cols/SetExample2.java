package com.java.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set names = new LinkedHashSet();
        names.add("Kratika");
        names.add("Harsh");
        names.add("Lokesh");
        names.add("Gaurav");
        names.add("Bharathi");
        names.add("Priya");
        names.add("Kratika");
        names.add("Harsh");
        names.add("Lokesh");
        names.add("Gaurav");
        names.add("Bharathi");
        names.add("Priya");
        names.add("Kratika");
        names.add("Harsh");
        names.add("Lokesh");
        names.add("Gaurav");
        names.add("Bharathi");
        names.add("Priya");
        names.add("Kratika");
        names.add("Harsh");
        names.add("Lokesh");
        names.add("Gaurav");
        names.add("Bharathi");
        names.add("Priya");
        names.add("Kratika");
        names.add("Harsh");
        names.add("Lokesh");
        names.add("Gaurav");
        names.add("Bharathi");
        names.add("Priya");

        System.out.println("Names are ");
        for (Object name : names) {
            System.out.println(name);
        }
    }
}
