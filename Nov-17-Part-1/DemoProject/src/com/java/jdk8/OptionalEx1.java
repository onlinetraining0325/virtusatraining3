package com.java.jdk8;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[0]="Premjeet";
        str[1]="Sandhan";
        str[2]="Swati";
        str[6]="Mishra";
        System.out.println(str[5]);
        Optional<String> result = Optional.ofNullable(str[5]);
        if(result.isPresent()){
            System.out.println(str[5].toUpperCase());
        } else {
            System.out.println("Value is Not Present...");
        }
    }
}
