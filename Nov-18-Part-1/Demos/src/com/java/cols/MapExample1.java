package com.java.cols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> data = new HashMap<Integer,String>();
        data.put(1, "Lokesh");
        data.put(2, "Sai Karthik");
        data.put(3, "Meghana");
        data.put(4, "Junaid");
        data.put(5, "Kratika");

        int key;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        key = sc.nextInt();
        result = data.getOrDefault(key, "Not Found...");
        System.out.println(result);
    }
}
