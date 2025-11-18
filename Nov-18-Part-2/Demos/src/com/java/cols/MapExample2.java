package com.java.cols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> data = new HashMap<String,String>();
        data.put("Harsh","Naidu");
        data.put("Priya","Darshini");
        data.put("Chandra","Sekhar");
        data.put("Akthitha","Merugu");
        data.put("Subham","Pathak");

        String user, pwd, res;
        System.out.println("Enter UserName and Password:   ");
        user = sc.next();
        pwd = sc.next();
        res = data.getOrDefault(user, "Invalid Password...");
        if (res.equals(pwd)) {
            System.out.println("Correct Credentials...");
        } else {
            System.out.println("Incorrect Credentials...");
        }
    }
}
