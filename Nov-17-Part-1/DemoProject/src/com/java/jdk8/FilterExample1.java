package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample1 {
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Harsh", 88234.22));
        employList.add(new Employ(2, "Anusri", 78822.33));
        employList.add(new Employ(3, "Junaid", 79002));
        employList.add(new Employ(4, "Gaurav", 80223.22));
        employList.add(new Employ(5, "Vaishnavi", 81234.22));
        employList.add(new Employ(6, "Indu", 79002.22));
        System.out.println("Employ List is  ");
        // Display Records whose Basic > 80000
        Stream<Employ> filter1 = employList.stream().filter(x -> x.basic >= 80000);
        System.out.println("Employe List is w.r.t. Basic > 80000  ");
        filter1.forEach(System.out::println);

        // Display Records whose Name ends with 'i'
        Stream<Employ> filter2 = employList.stream().filter(x -> x.name.endsWith("i"));
        System.out.println("Employe List w.r.t. Name Ends with 'i'  ");
        filter2.forEach(System.out::println);
    }
}
