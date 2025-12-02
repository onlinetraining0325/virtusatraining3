package com.java.thr;

class Fact extends Thread{
    @Override
    public void run() {
       int f = 1;
       for(int i=1;i<=8;i++) {
           f = f * i;
           System.out.println("Factorial Value  " +f);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}

class Odd extends Thread {
    @Override
    public void run() {
       for(int i=1;i<20;i+=2) {
           System.out.println("Odd  " +i);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}

class Even extends Thread {
    @Override
    public void run() {
        for(int i=0;i<20;i+=2) {
            System.out.println("Even  " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThrEx1 {
    public static void main(String[] args) {

        Even even = new Even();
        Odd odd = new Odd();
        Fact fact = new Fact();

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);
        Thread t3 = new Thread(fact);

        t1.start();
        t2.start();
        t3.start();
    }
}
