package com.java.gen;

public class Data<T> {

    public void swap(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
        System.out.println("A value  " +a+ " B value " +b);
    }
}
