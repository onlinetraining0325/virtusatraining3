package com.java.thr;


class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<20;i++) {
            System.out.println("I value  " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SuspendEx1 {

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        Thread thr1 = new Thread(t1);
        thr1.start();

        Thread.sleep(2000);

        thr1.suspend();

        Thread.sleep(3000);

        System.out.println("Resuming the Thread Again");
        thr1.resume();
    }
}
