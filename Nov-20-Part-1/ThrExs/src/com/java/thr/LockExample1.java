package com.java.thr;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Lock lock = new ReentrantLock();
        Callable<String> task1 = () -> {
          lock.lock();
          try {
              Thread.sleep(1000);
              return "This is My First Example of Lock";
          } catch (InterruptedException e) {
              e.printStackTrace();
          } finally {
              lock.unlock();
          }
          return "";
        };

        Future<String> futureTask1 = executor.submit(task1);
        Future<String> futureTask2 = executor.submit(task1);

        System.out.println(futureTask1.get());
        System.out.println(futureTask2.get());

        executor.shutdown();
    }
}
