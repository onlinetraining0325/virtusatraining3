package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Shared resource
class BankAccount {
    private int balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
    }

    public void deposit(int amount) {
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    public int getBalance() {
        return balance;
    }
}

// Worker Task
class TransactionTask implements Callable<String> {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    private final int id;
    private final BankAccount account;

    public TransactionTask(BankAccount account) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.account = account;
    }

    @Override
    public String call() {
        Random rand = new Random();
        int amount = rand.nextInt(5000) + 500;   // 500 – 5500
        boolean isWithdraw = rand.nextBoolean();

        if (isWithdraw) {
            boolean status = account.withdraw(amount);
            return "Txn-" + id + " WITHDRAW " + amount +
                    " → " + (status ? "SUCCESS" : "FAILED (Insufficient Funds)" + " Balance " +account.getBalance());
        } else {
            account.deposit(amount);
            return "Txn-" + id + " DEPOSIT " + amount + " → SUCCESS"  + " Balance  " +account.getBalance();
        }
    }
}

public class BankTransactionDemo {
    public static void main(String[] args) throws Exception {

        BankAccount account = new BankAccount(2000);

        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<String>> results = new ArrayList<>();

        // Submit 10 concurrent tasks
        for (int i = 0; i < 10; i++) {
            results.add(executor.submit(new TransactionTask(account)));
        }

        executor.shutdown();
        executor.awaitTermination(1000, TimeUnit.SECONDS);

        // Display results
        System.out.println("\n----- Transaction Results -----");
        for (Future<String> f : results) {
            System.out.println(f.get());
            Thread.sleep(1000);
        }

        System.out.println("\nFinal Account Balance = " + account.getBalance());
    }
}
