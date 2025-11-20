package com.java.thr;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallEx {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> {System.out.println("Welcome to Service3");});

        Future<List<String>> names = executor.submit(() -> {
            System.out.println("List of Names are getting returned...");
            List<String> students = Arrays.asList("Lokesh","Anusri","Karthik","Islam","Indu");
            return students;
        });

        Future<List<Integer>> future1 = executor.submit(() -> {
            return Arrays.asList(1,2,3,4,5);
        });

        Future<Integer> futureTask1 =  executor.submit(() -> {
            System.out.println("Hi Its Future Task");
            return 1;
        });

//        List<Future> lists=Arrays.asList(names,futureTask1,future1);

        List<Callable<Future>> lists = Arrays.asList(
                () -> future1,
                () -> futureTask1,
                () -> names
        );

        for(Callable<Future> callable : lists){
            System.out.println(callable);
        }
    }
}
