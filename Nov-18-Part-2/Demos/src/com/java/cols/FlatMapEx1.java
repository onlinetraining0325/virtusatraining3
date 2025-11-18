package com.java.cols;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx1 {

    public static void main(String[] args) {
        List<String > list1 = Arrays.asList("Gaurav", "Sai", "Lokesh");
        List<String > list2 = Arrays.asList("Akshitha", "Junaid", "Priya");
        List<String > list3 = Arrays.asList("Shaili", "Vivek", "Indu");

        List<List<String >> all = Arrays.asList(list1, list2, list3);
        all.forEach(System.out::println);

        List<String> flatEx = all.stream().flatMap(x ->  x.stream()).collect(Collectors.toList());
        flatEx.forEach(System.out::println);
    }
}
