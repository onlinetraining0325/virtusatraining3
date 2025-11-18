package com.java.cols;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

    public static void filterEmployees(List<Employ> list, Predicate<Employ> predicate) {
       list.stream().filter(predicate).forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Raj", 84823.22));
        employList.add(new Employ(2, "Anitha", 90032.22));
        employList.add(new Employ(3, "Kamal", 90011.22));
        employList.add(new Employ(4, "Nalini", 99211.22));
        employList.add(new Employ(5, "Prajwal", 99011.22));
        employList.add(new Employ(6, "Nimisha", 84411.22));

        Predicate<Integer> isEven = n -> n%2==0;

        System.out.println(isEven.test(7));
        System.out.println(isEven.test(8));

        Predicate<String> length3 = e -> e.length()>3;
        System.out.println(length3.test("Lokesh"));
        System.out.println(length3.test("Lokesh"));
        System.out.println(length3.test("Ram"));

        Predicate<Employ> part = e -> e.getName().startsWith("N");

        System.out.println("Filter By Name Starts with 'N'  ");
        employList.stream().filter(part).forEach(System.out::println);

        Predicate<Employ> part2 = e -> e.getBasic() >= 90000;

        System.out.println("Whose Basic > 90000  ");

        employList.stream().filter(part2).forEach(System.out::println);

        Predicate<Employ> part4 = e -> e.getBasic() >= 80000 && e.getBasic() <= 90000;

        System.out.println("Salary Between 80000 and 90000  ");
        employList.stream().filter(part4).forEach(System.out::println);

        System.out.println("Names not start with Char 'N' are  ");
        employList.stream().filter(part.negate()).forEach(System.out::println);

        System.out.println("Custom Predicate Example  ");
        filterEmployees(employList, part4);
    }
}
