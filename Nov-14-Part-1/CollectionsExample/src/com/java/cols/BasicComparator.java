package com.java.cols;

import java.util.Comparator;

public class BasicComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employ emp1 = (Employ)o1;
        Employ emp2 = (Employ)o2;
        return (int) (emp1.basic - emp2.basic);
    }
}
