package com.java.jdk8;

interface ICalculation {
    int calc(int a, int b);
}

public class LambdaExpr2 {
    public static void main(String[] args) {
        ICalculation obj1 = (a,b) ->  a+b;
        ICalculation obj2 = (a,b) -> a-b;
        ICalculation obj3 = (a,b) -> a*b;

        System.out.println("Sum is  " +obj1.calc(12,5));
        System.out.println("Sum is  " +obj2.calc(12,5));
        System.out.println("Mult is  " +obj3.calc(12,5));
    }
}
