package com.java.cols;

import java.util.Vector;

public class VectorEx {

    public static void main(String[] args) {
        Vector vector = new Vector(3,2);
        System.out.println("Sizie " + vector.size());
        System.out.println("Capacity : " + vector.capacity());

        vector.addElement("Lokesh");
        vector.addElement("Gaurav");
        System.out.println("Sizie " + vector.size());
        System.out.println("Capacity : " + vector.capacity());

        vector.addElement("Bharathi");
        System.out.println("Sizie " + vector.size());
        System.out.println("Capacity : " + vector.capacity());

        vector.addElement("Karthik");
        System.out.println("Sizie " + vector.size());
        System.out.println("Capacity : " + vector.capacity());
    }
}
