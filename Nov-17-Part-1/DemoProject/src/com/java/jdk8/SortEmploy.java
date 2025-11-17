package com.java.jdk8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortEmploy {

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

        Collections.sort(employList, (e1,e2) -> {
            return e1.name.compareTo(e2.name);
        });

        System.out.println("Sorted Data By Name  ");
        employList.forEach(x -> {
            System.out.println(x);
        });

        Collections.sort(employList, (e1, e2) -> {
            return (int) (e1.basic - e2.basic);
        });

        System.out.println("Sorted Data By Basic  ");
        employList.forEach(x -> {
           System.out.println(x);
        });
    }
}
