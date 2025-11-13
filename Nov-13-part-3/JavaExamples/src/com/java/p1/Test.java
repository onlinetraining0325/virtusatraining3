package com.java.p1;

public class Test extends Data {

    public void show() {
        Test test = new Test();
        System.out.println(test.publicStr);
        System.out.println(test.protectedStr);
        System.out.println(test.friendlyStr);
    }
}
