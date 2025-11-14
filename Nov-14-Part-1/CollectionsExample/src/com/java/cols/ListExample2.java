package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(new Integer(42));
        numbers.add(new Integer(11));
        numbers.add(new Integer(31));
        numbers.add(new Integer(63));
        numbers.add(new Integer(67));
        numbers.add(new Integer(99));

        int sum = 0;
        for(Object ob : numbers){
            sum +=(Integer)ob;
        }
        System.out.println("Sum is  " +sum);
    }
}
