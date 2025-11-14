package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

    public static void main(String[] args) {
        Comparator comp = new CityComparator();
        SortedSet students = new TreeSet(comp);
        students.add(new Student(1,"Harsh","Hyderabad",9.3));
        students.add(new Student(2,"Bharathi","Chennai",8.9));
        students.add(new Student(3,"Indu","Pune",8.7));
        students.add(new Student(4,"Anusri","Delhi",8.8));
        students.add(new Student(5,"Deepak","Hyderabad",9.1));

        System.out.println("Students List ");
        for(Object student : students){
            Student temp = (Student)student;
            System.out.println(temp);
        }
    }
}
