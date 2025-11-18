package com.java.cols;

interface IOne {
    default void display(){
        System.out.println("Display Method from IOne Interface...");
    }
}

interface ITwo {
    default void display() {
        System.out.println("Display Method from ITwo Interface...");
    }
}

interface IThree {
    default void display() {
        System.out.println("Display Method from IThree Interface...");
    }
}

class Hello implements IOne, ITwo, IThree {

    @Override
    public void display() {
        IOne.super.display();
        ITwo.super.display();
        IThree.super.display();
    }
}
public class Test {
    public static void main(String[] args) {
        new Hello().display();
    }
}
