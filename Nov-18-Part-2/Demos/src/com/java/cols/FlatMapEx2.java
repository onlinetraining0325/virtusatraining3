package com.java.cols;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx2 {
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Raj", 84823.22));
        employList.add(new Employ(2, "Anitha", 90032.22));
        employList.add(new Employ(3, "Kamal", 90011.22));
        employList.add(new Employ(4, "Nalini", 99211.22));
        employList.add(new Employ(5, "Prajwal", 99011.22));
        employList.add(new Employ(6, "Nimisha", 84411.22));

        System.out.println("Print Names only");
        employList.stream().flatMap(emp ->
                Stream.of(emp.getName())).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("All Employee Records are  ");
        employList.stream().flatMap(emp ->
                Stream.of(String.valueOf(emp.getEmpno()), emp.getName(), String.valueOf(emp.getBasic()))).
                collect(Collectors.toList()).forEach(System.out::println);

    }
}
