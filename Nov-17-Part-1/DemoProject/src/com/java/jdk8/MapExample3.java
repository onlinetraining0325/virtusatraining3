package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class MapExample3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Akshitha");
        names.add("Meghana");
        names.add("Kratika");
        names.add("Vaishnavi");
        names.add("Chitrangana");
        names.add("Aripta");

        names.stream().map(String::length).forEach(System.out::println);
    }
}
