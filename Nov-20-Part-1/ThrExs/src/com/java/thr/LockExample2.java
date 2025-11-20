package com.java.thr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample2 {

    public static int count = 0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Lock lock = new ReentrantLock();

        Callable<Integer> incrementTask =  () -> {
            lock.lock();
            try {
                int newValue = count ++;
                System.out.println(Thread.currentThread().getName()+  "  :   " +newValue);
                return  newValue;
            } finally {
                lock.unlock();
            }
        };
        Future<Integer> f1 = executorService.submit(incrementTask);
        Future<Integer> f2 = executorService.submit(incrementTask);
        Future<Integer> f3 = executorService.submit(incrementTask);
        Future<Integer> f4 = executorService.submit(incrementTask);

        List<Future<Integer>> futures = Arrays.asList(f1, f2, f3, f4);
        for (Future<Integer> future : futures) {
            future.get();
        }
        executorService.shutdown();
    }
}
