package com.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result =
                numbers.stream().map(x -> x * 3)
                        .collect(Collectors.toList());
        System.out.println("Mapped Result  ");
        result.forEach(System.out::println);
    }
}
