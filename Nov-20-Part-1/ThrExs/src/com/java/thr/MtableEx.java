package com.java.thr;

class Tab3 implements Runnable {

    Table table;

    Tab3(Table table) {
        this.table = table;
    }
    @Override
    public void run() {
        table.showTab(19);
    }
}

class Tab2 implements Runnable {

    Table table;
    Tab2(Table table) {
        this.table = table;
    }
    @Override
    public void run() {
        table.showTab(8);
    }
}

class Tab1 implements Runnable {
    Table table;
    Tab1(Table table) {
        this.table = table;
    }
    public void run() {
        table.showTab(12);
    }
}

class Table {
    synchronized void showTab(int n) {
        int p;
        for(int i=1;i<=10;i++) {
            p = n * i;
            System.out.println(n + " *  " +i+ " = " +p);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MtableEx {
    public static void main(String[] args) {
        Table table = new Table();
        Tab1 tab1 = new Tab1(table);
        Tab2 tab2 = new Tab2(table);
        Tab3 tab3 = new Tab3(table);

        Thread t1 = new Thread(tab1);
        Thread t2 = new Thread(tab2);
        Thread t3 = new Thread(tab3);

        t1.start();
        t2.start();
        t3.start();
    }
}
