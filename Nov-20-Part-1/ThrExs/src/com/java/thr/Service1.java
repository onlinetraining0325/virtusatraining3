package com.java.thr;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service1 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> System.out.println("Welcome to Thread Concurrecy..."));
        Future<Integer> futureTask1 =  executor.submit(() -> {
           System.out.println("Hi Its Future Task");
           return 1;
        });
        try {
            System.out.println(futureTask1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
        System.out.println("Gets Shutdown...");
    }
}
