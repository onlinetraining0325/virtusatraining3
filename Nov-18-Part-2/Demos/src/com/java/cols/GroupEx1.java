package com.java.cols;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEx1 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Akshitha",Gender.FEMALE,"Java","Expert",82344));;
        employees.add(new Employee(2, "Bharathi",Gender.FEMALE,"Dotnet","Manager",90233));;
        employees.add(new Employee(3, "Gaurav",Gender.MALE,"Java","TL",98822));;
        employees.add(new Employee(4, "Karthik",Gender.MALE,"Sql","Trainee",92244));;
        employees.add(new Employee(5, "Anusri",Gender.FEMALE,"Java","Manager",90114));;
        employees.add(new Employee(6, "Subham",Gender.MALE,"Dotnet","DBA",88731));;

        Map<String, List<Employee>> grouped =
                employees.stream().collect(Collectors.groupingBy( e -> e.getDept()));
        grouped.forEach((str,list) -> {
            System.out.println("Department  " +str);
            list.forEach(System.out::println);
        });

        System.out.println("Flat Records  ");
        grouped.values().stream().flatMap(l -> l.stream()).forEach(System.out::println);

        System.out.println("Group By Gender  ");
        Map<Gender, List<Employee>> groupedGender =
                employees.stream().collect(Collectors.groupingBy( e -> e.getGender()));;
        groupedGender.forEach((str,list) -> {
            System.out.println("Gender  " +str);
            list.forEach(System.out::println);
        });
    }
}
