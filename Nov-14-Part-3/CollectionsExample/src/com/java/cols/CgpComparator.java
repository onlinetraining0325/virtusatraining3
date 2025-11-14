package com.java.cols;

import java.util.Comparator;

public class CgpComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return (int) (s1.cgp-s2.cgp);
    }
}
