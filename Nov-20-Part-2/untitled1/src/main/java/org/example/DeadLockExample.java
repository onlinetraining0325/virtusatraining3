package org.example;

public class DeadLockExample {

    public static void main(String[] args) throws InterruptedException {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        First first = new First(resource1, resource2);
        first.setName("Harsh");
        Thread thr1 = new Thread(first);
        thr1.start();

        Second second = new Second(resource1, resource2);
        second.setName("Shaili");
        Thread thr2 = new Thread(second);
        thr2.start();

        Thread.sleep(2000);

    }
}
