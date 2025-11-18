package com.java.cols;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Prog2 {

    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Raj", 84823.22));
        employList.add(new Employ(2, "Anitha", 90032.22));
        employList.add(new Employ(3, "Kamal", 90011.22));
        employList.add(new Employ(4, "Nalini", 99211.22));
        employList.add(new Employ(5, "Prajwal", 99011.22));
        employList.add(new Employ(6, "Nimisha", 84411.22));

        System.out.println("Sort By Name Wise  ");

        employList.stream().sorted( (e1, e2) -> {
            return e1.getName().compareTo(e2.getName());
        }).forEach(System.out::println);

        System.out.println("Total No.of Records  " +employList.stream().count());

        System.out.println("First 5 Records are  ");
        employList.stream().limit(5).forEach(System.out::println);

        System.out.println("Sort and Display first 5 records salary wise  ");
        employList.stream().sorted( (e1, e2) -> {
            return (int) (e2.getBasic() - e1.getBasic());
        }).limit(5).forEach(System.out::println);

        Employ maxEmp = employList.stream().max(Comparator.comparing(Employ::getBasic)).orElse(null);
        System.out.println("Max Emp is " + maxEmp);

        Employ minEmp = employList.stream().min(Comparator.comparing(Employ::getBasic)).orElse(null);
        System.out.println("Min Emp is " + minEmp);

        double totalSalary = employList.stream().map(Employ::getBasic).
                reduce(0.0, (a,b) -> a + b );
        System.out.println("Total Salary is " + totalSalary);

        double total = employList.stream().map(Employ::getBasic).reduce(0.0,Double::sum);
        System.out.println("Total Salary is " + total);
    }
}
