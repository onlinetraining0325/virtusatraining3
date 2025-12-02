package com.java.thr;

import java.util.*;

class Third implements  Runnable{

    @Override
    public void run() {
        Vector<String> names = new Vector<>();
        names.addElement("Karthik");
        names.addElement("Subham");
        names.addElement("Chandra");
        names.addElement("Indu");
        names.addElement("Priya");
        names.addElement("Shaili");

        names.forEach(x -> {
            System.out.println("Vector Data  " +x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

class Second implements Runnable{

    @Override
    public void run() {
        Set<String> names = new HashSet<String>();
        names.add("Karthik");
        names.add("Subham");
        names.add("Chandra");
        names.add("Indu");
        names.add("Priya");
        names.add("Shaili");
        names.add("Karthik");
        names.add("Subham");
        names.add("Chandra");
        names.add("Indu");
        names.add("Priya");
        names.add("Shaili");
        names.add("Karthik");
        names.add("Subham");
        names.add("Chandra");
        names.add("Indu");
        names.add("Priya");
        names.add("Shaili");

        names.forEach(x -> {
            System.out.println("Set Data List  " +x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

class First implements Runnable{

    @Override
    public void run() {
        List<String> names = new ArrayList<String>();
        names.add("Karthik");
        names.add("Subham");
        names.add("Chandra");
        names.add("Indu");
        names.add("Priya");
        names.add("Shaili");

        names.forEach(x -> {
            System.out.println("Array List  " +x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

public class ThrEx2 {

    public static void main(String[] args) {
        First f = new First();
        Second s = new Second();
        Third t = new Third();

        Thread th1 = new Thread(f);
        Thread th2 = new Thread(s);
        Thread th3 = new Thread(t);

        th1.start();

        th2.start();
        try {
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th3.start();
    }
}
