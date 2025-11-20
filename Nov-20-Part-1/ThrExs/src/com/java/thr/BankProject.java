package com.java.thr;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Sbi {
    private int balance = 30000;

    private final Lock lock = new ReentrantLock();

    public int sendAmount(int amount) {
        lock.lock();
        try {
            balance += amount;
            return balance;
        } finally {
            lock.unlock();
        }
    }

}

public class BankProject {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Sbi sbi = new Sbi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount for First Transfer  ");
        int a1 = sc.nextInt();
        System.out.println("Enter Amount for Second Transfer  ");
        int a2 = sc.nextInt();
        System.out.println("Enter Amount for Third Transfer  ");
        int a3 = sc.nextInt();
        System.out.println("Enter Amount for Fourth Transfer  ");
        int a4 = sc.nextInt();

        // Create callables using user input
        Callable<Integer> deposit1 = () -> {
            int newBalance = sbi.sendAmount(a1);
            System.out.println(Thread.currentThread().getName() + " Sending Amount " +a1+ " New Balance: " + newBalance);
            return newBalance;
        };

        Callable<Integer> deposit2 = () -> {
            int newBalance = sbi.sendAmount(a2);
            System.out.println(Thread.currentThread().getName() + " Sending Amount " +a2+ " New Balance: " + newBalance);
            return newBalance;
        };

        Callable<Integer> deposit3 = () -> {
            int newBalance = sbi.sendAmount(a3);
            System.out.println(Thread.currentThread().getName() + " Sending Amount " +a3+ " New Balance: " + newBalance);
            return newBalance;
        };

        Callable<Integer> deposit4 = () -> {
            int newBalance = sbi.sendAmount(a4);
            System.out.println(Thread.currentThread().getName() +  " Sending Amount " +a4+ " New Balance: " + newBalance);
            return newBalance;
        };

        Future<Integer> f1 = executorService.submit(deposit1);
        Future<Integer> f2 = executorService.submit(deposit2);
        Future<Integer> f3 = executorService.submit(deposit3);
        Future<Integer> f4 = executorService.submit(deposit4);

        List<Future<Integer>> futures = Arrays.asList(f1,f2,f3,f4);

        executorService.shutdown();

    }
}
