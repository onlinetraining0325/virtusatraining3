package com.java.p1;

public class Data {
    private String privateStr="Virtusa";
    public String publicStr = "Ranjan";
    protected String protectedStr = "Prasanna";
    String friendlyStr="Subham";

    public void show() {
        System.out.println(privateStr);
        System.out.println(publicStr);
        System.out.println(protectedStr);
        System.out.println(friendlyStr);
    }
}
