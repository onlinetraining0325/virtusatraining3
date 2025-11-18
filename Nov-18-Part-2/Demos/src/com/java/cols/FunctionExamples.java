package com.java.cols;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExamples {
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Raj", 84823.22));
        employList.add(new Employ(2, "Anitha", 90032.22));
        employList.add(new Employ(3, "Kamal", 90011.22));
        employList.add(new Employ(4, "Nalini", 99211.22));
        employList.add(new Employ(5, "Prajwal", 99011.22));
        employList.add(new Employ(6, "Nimisha", 84411.22));

        Function<Employ, String> getName = e -> e.getName();

        System.out.println("Employ Names are  ");
        employList.stream().map(getName).forEach(System.out::println);

        Function<Employ,Double> getSal = e -> e.getBasic();
        System.out.println("Salaries are ");
        employList.stream().map(getSal).forEach(System.out::println);

        Function<Employ,String> getAll = e -> "Employ No  " +e.getEmpno()
                + " Employ Name  " +e.getName() + " Basic  " +e.getBasic();
        System.out.println("All Employee Details are  ");
        employList.stream().map(getAll).forEach(System.out::println);

        Function<Employ, Double> incr = e -> e.getBasic() * 1.10;

        employList.stream().map(incr).forEach(System.out::println);

        Function<Double,String> toString = s -> " Updated Salary " +s;

        System.out.println("Multiple Employee Records are   ");

        employList.stream().map(incr.andThen(toString)).forEach(System.out::println);

        Function<Employ, Employ> increment = e ->
                new Employ(e.getEmpno(), e.getName(), e.getBasic() * 1.10);
        System.out.println("Employee Records are after returning  ");
        employList.stream().map(increment).forEach(System.out::println);
    }
}
