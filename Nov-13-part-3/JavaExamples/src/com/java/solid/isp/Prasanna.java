package com.java.solid.isp;

public class Prasanna implements  IEmployDetails{
    @Override
    public void name() {
        System.out.println("Name is Prasanna Pappu...");
    }

    @Override
    public void paymentDetails() {
        System.out.println("Payment will come after TDS Deduction...");
    }
}
