package com.java.thr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class IciciAccount {
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
public class PhonePeExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        IciciAccount iciciAccount = new IciciAccount();
        AtomicInteger depositAmount = new AtomicInteger();


        Callable<Integer> deposit = () -> {

            int newBalance = iciciAccount.sendAmount(200);
            System.out.println(Thread.currentThread().getName() + " New Balnace " + newBalance );
            return newBalance;
        };

        Future<Integer> d1 = executorService.submit(deposit);
        Future<Integer> d2 = executorService.submit(deposit);
        Future<Integer> d3 = executorService.submit(deposit);
        Future<Integer> d4 = executorService.submit(deposit);

        List<Future<Integer>> futures = Arrays.asList(d1,d2,d3,d4);
    }
}
