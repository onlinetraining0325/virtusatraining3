package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Harsh", 88234.22));
        employList.add(new Employ(2, "Anusri", 78822.33));
        employList.add(new Employ(3, "Junaid", 79002));
        employList.add(new Employ(4, "Gaurav", 80223.22));
        employList.add(new Employ(5, "Vaishnavi", 81234.22));
        employList.add(new Employ(6, "Indu", 79002.22));
        System.out.println("Employ List is  ");
        employList.forEach(x -> {
            System.out.println(x);
        });
        List<Employ> map1 = employList.stream()
                .map(x -> new Employ(
                        x.getEmpno(),
                        x.getName().toUpperCase(),
                        x.getBasic()
                ))
                .collect(Collectors.toList());
        System.out.println("Mapped Employ List is  ");
        map1.forEach(System.out::println);
    }
}
