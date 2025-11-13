package com.java.sup;

public class EmployMain {
    public static void main(String[] args) {
//        Employ e1 = new Priya(1, "Priya", 50000);
//        Employ e2 = new Karthik(2, "Karthik", 67733);
//        Employ e3 = new Bharathi(3, "Bharathi", 67733);
        Employ[] arr = new Employ[] {
                new Priya(1, "Priya", 50000),
                new Karthik(2, "Karthik", 67733),
                new Bharathi(3, "Bharathi", 67733)
        };

        for(Employ e : arr) {
            System.out.println(e);
        }
    }
}
