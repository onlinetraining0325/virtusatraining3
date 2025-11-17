package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class LoopEx2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Junaid");
        names.add("Gaurav");
        names.add("Subham");
        names.add("Shaili");
        names.add("Lokesh");
        names.add("Chandra");
        names.add("Harsh");
        System.out.println("Names are  ");
        names.forEach(System.out::println);
    }
}
