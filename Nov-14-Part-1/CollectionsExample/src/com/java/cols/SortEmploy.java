package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

    public static void main(String[] args) {
//        Comparator comp = new NameComparator();
        Comparator comp = new BasicComparator();
        SortedSet employs = new TreeSet(comp);
        employs.add(new Employ(1,"Harsh",88234));
        employs.add(new Employ(2,"Gaurav",90024));
        employs.add(new Employ(3,"Deepak",77234));
        employs.add(new Employ(4,"Akshitha",90032));
        employs.add(new Employ(5,"Bharathi",90322));
        employs.add(new Employ(6,"Arpita",99733));

        System.out.println("Employ Records are  ");
        for(Object ob : employs){
            Employ employ = (Employ)ob;
            System.out.println(employ);
        }
    }
}
