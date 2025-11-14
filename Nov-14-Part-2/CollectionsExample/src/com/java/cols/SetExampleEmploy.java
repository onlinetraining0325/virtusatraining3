package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class SetExampleEmploy {

    public static void main(String[] args) {
        Set employs = new HashSet();
        employs.add(new Employ(1,"Harsh",88234));
        employs.add(new Employ(2,"Gaurav",90024));
        employs.add(new Employ(3,"Deepak",77234));
        employs.add(new Employ(4,"Akshitha",90032));
        employs.add(new Employ(5,"Bharathi",90322));
        employs.add(new Employ(6,"Arpita",99733));
        employs.add(new Employ(1,"Harsh",88234));
        employs.add(new Employ(2,"Gaurav",90024));
        employs.add(new Employ(3,"Deepak",77234));
        employs.add(new Employ(4,"Akshitha",90032));
        employs.add(new Employ(1,"Harsh",88234));
        employs.add(new Employ(2,"Gaurav",90024));
        employs.add(new Employ(3,"Deepak",77234));
        employs.add(new Employ(4,"Akshitha",90032));
        employs.add(new Employ(5,"Bharathi",90322));
        employs.add(new Employ(6,"Arpita",99733));
        employs.add(new Employ(5,"Bharathi",90322));
        employs.add(new Employ(6,"Arpita",99733));

        for (Object employ : employs) {
            System.out.println(employ);
        }
    }
}
