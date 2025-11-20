package org.example;

public class Resource {
    // first synchronized method
    synchronized void test1(Resource s2)
    {
        System.out.println(Thread.currentThread().getName()
                + " enters test1 of " + this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Trying to call test2 on another object
        s2.test2();
        System.out.println(Thread.currentThread().getName()
                + " exits test1 of " + this);
    }

    // Second synchronized method
    synchronized void test2()
    {
        System.out.println(Thread.currentThread().getName()
                + " enters test2 of " + this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // taking object lock of s1 enters into test1 method
        System.out.println(Thread.currentThread().getName()
                + " exits test2 of " + this);
    }

}
