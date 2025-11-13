package com.java.p2;

import com.java.p1.Data;


public class Testing extends Data
{
    public void show() {
        Testing testing = new Testing();
        System.out.println(testing.publicStr);
        System.out.println(testing.protectedStr);
    }
}
