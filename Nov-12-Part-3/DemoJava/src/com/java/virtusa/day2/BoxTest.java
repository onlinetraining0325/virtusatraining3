package com.java.virtusa.day2;

public class BoxTest {

    public void show(Object ob) {
        if (ob instanceof Integer) {
            int x = (Integer)ob;
            System.out.println("Integer Casting Performed..."+x);
        }
        if (ob instanceof Double) {
            double x = (Double)ob;
            System.out.println("Double Casting Performed..."+x);
        }
        if (ob instanceof String) {
            String x = (String)ob;
            System.out.println("String Casting Performed..."+x);
        }
    }
    public static void main(String[] args) {
        int a = 12;
        double b = 12.5;
        String str = "Virtusa";
        BoxTest boxTest = new BoxTest();
        boxTest.show(a);
        boxTest.show(b);
        boxTest.show(str);
    }
}
