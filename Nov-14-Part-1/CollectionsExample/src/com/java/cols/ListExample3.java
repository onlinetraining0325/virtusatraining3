package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

    public static void main(String[] args) {

        List employs = new ArrayList();
        employs.add(new Employ(1,"Harsh",88234));
        employs.add(new Employ(2,"Gaurav",90024));
        employs.add(new Employ(3,"Deepak",77234));
        employs.add(new Employ(4,"Akshitha",90032));
        employs.add(new Employ(5,"Bharathi",90322));
        employs.add(new Employ(6,"Arpita",99733));

        for(Object ob : employs){
            Employ employ = (Employ) ob;
            System.out.println(employ);
        }
    }
}
