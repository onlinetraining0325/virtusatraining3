package com.java.abs;

import com.java.sup.Employ;

public class AbsMain3 {
    public static void main(String[] args) {
        Employ[] arr = new Employ[] {
          new Gaurav(1,"Gaurav",83823),
          new Akshitha(2,"Akshitha",78942),
          new Junaid(3,"Junaid",90023),
        };

        for(Employ e : arr){
            System.out.println(e);
        }
    }
}
