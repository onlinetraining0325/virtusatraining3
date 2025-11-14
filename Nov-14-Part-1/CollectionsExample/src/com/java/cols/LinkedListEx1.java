package com.java.cols;

import java.util.LinkedList;

public class LinkedListEx1 {

    public static void main(String[] args) {
        LinkedList names = new LinkedList();
        names.add("Karthik");
        names.add("Shaili");
        names.add("Kratika");
        names.add("Harsh");
        names.add("Lokesh");
        names.add("Gaurav");
        names.add("Bharathi");
        names.add("Priya");

        names.addFirst("Indu");
        names.addLast("Indumathi");

        System.out.println("Linked List Methods are  ");

        for(Object ob : names) {
            String str = (String)ob;
            System.out.println(str);
        }
    }
}
