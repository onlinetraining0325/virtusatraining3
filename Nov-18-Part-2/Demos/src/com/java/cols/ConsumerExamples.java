package com.java.cols;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExamples {

    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Raj", 84823.22));
        employList.add(new Employ(2, "Anitha", 90032.22));
        employList.add(new Employ(3, "Kamal", 90011.22));
        employList.add(new Employ(4, "Nalini", 99211.22));
        employList.add(new Employ(5, "Prajwal", 99011.22));
        employList.add(new Employ(6, "Nimisha", 84411.22));

        Consumer<Employ> employRecord1 = e ->  System.out.println(e);
        employList.forEach(employRecord1);

        System.out.println("Employ Names are    ");
        Consumer<Employ> empName = e ->  System.out.println("Employ Name " +e.getName());
        employList.forEach(empName);

        Consumer<Employ> increaseSalary = e ->  e.setBasic(e.getBasic() * 1.10);
        employList.forEach(increaseSalary);
        employList.forEach(System.out::println);


    }
}
