package com.java.thr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> System.out.println("Sum Program"));

        Future<List<Integer>> future1 = executor.submit(() -> {
            return Arrays.asList(1,2,3,4,5);
        });

        try {
            List<Integer> list1 = future1.get();
            int sum = list1.stream().reduce(0, (a, b) -> a + b);
            System.out.println(sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
        System.out.println("Program Ended...");
    }
}
