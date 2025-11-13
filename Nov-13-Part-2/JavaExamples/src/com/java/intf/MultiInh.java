package com.java.intf;

interface IOne {
    void name();
}

interface ITwo {
    void email();
}

class Chandra implements IOne, ITwo {

    @Override
    public void name() {
        System.out.println("Name is Chandra...");
    }

    @Override
    public void email() {
        System.out.println("Email is Chandra@gmail.com");
    }
}
public class MultiInh {
    public static void main(String[] args) {
        Chandra chandra = new Chandra();
        chandra.name();
        chandra.email();
    }
}
