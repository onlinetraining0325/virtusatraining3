package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Meghana");
        names.add("Karthik");
        names.add("Anusri");
        names.add("Subham");
        names.add("Deepak");
        System.out.println("Names are ");
        for(Object obj : names){
            System.out.println(obj);
        }
        names.add(3,"Lokesh");
        System.out.println("Names after Insert ");
        for(Object ob : names) {
            System.out.println(ob);
        }

        names.set(3,"Punwani");
        System.out.println("Names after Updated  ");
        for(Object ob : names) {
            System.out.println(ob);
        }

        names.remove("Deepak");
        System.out.println("Names after Removed  ");
        for(Object ob : names) {
            System.out.println(ob);
        }
        names.remove(2);
        System.out.println("Names after remove by index  ");
        for(Object ob : names) {
            System.out.println(ob);
        }
    }
}
