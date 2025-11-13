package com.java.p1;

public class Demo {

    public void show() {
        Data data = new Data();
        System.out.println(data.protectedStr);
        System.out.println(data.publicStr);
        System.out.println(data.friendlyStr);
    }
}
