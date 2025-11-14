package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenExample1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Karthik");
        names.add("Shaili");
        names.add("Kratika");
        names.add("Harsh");
        names.add("Lokesh");
        names.add("Gaurav");
        names.add("Bharathi");
        names.add("Priya");
//        names.add(11);
        for(String name : names){
            System.out.println(name);
        }
    }
}
