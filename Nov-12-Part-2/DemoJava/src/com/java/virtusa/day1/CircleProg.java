package com.java.virtusa.day1;

import java.util.Scanner;

/**
 * Program to find area and circumference of circle
 * Program by prasanna
 * for virtusa team
 */
public class CircleProg {

    public void calculation(double radius){
        double area, circ;
        area = 3.14 * radius * radius;
        circ = 2 * 3.14 * radius;
        System.out.println("Area of circle is: " + area);
        System.out.println("Circumference of circle is: " + circ);
    }
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        radius = sc.nextDouble();
        CircleProg circle = new CircleProg();
        circle.calculation(radius);
    }
}
