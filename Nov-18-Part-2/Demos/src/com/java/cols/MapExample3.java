package com.java.cols;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {

    public static void main(String[] args) {
        Map<String,String> data = new HashMap<String,String>();
        data.put("Harsh","Naidu");
        data.put("Priya","Darshini");
        data.put("Chandra","Sekhar");
        data.put("Akthitha","Merugu");
        data.put("Subham","Pathak");

        System.out.println("HashMap Data is    ");
        for(Map.Entry<String,String> entry:data.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
