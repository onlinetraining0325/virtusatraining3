package com.java.gen;

import java.util.*;

public class SortEmploy {

    public static void main(String[] args) {
//        Comparator comparator = new NameComparator();
        Comparator comp = new BasicComparator();
        SortedSet<Employ> employs = new TreeSet<Employ>(comp);
        employs.add(new Employ(1,"Harsh",88234));
        employs.add(new Employ(2,"Gaurav",90024));
        employs.add(new Employ(3,"Deepak",77234));
        employs.add(new Employ(4,"Akshitha",90032));
        employs.add(new Employ(5,"Bharathi",90322));
        employs.add(new Employ(6,"Arpita",99733));

        System.out.println("Employs in SortedSet");
        for(Employ employ:employs){
            System.out.println(employ);
        }
    }
}
