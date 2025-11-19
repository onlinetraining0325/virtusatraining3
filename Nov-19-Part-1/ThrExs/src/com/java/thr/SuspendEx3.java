package com.java.thr;

import java.util.Scanner;

class Demo implements Runnable{

    private boolean status = false;

    public  void mySuspend() {
        status = true;
    }

    public synchronized void myResume() {
        status = false;
        notify();
    }


    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {



            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("I value " + i);

            if (i == 6) {
                System.out.println("Suspending thread...");
                mySuspend();

                System.out.println("Shall I Resume (Y/N)? ");
                String ch = sc.next();

                if (ch.equalsIgnoreCase("Y")) {
                    myResume();
                }
            }
        }

    }
}
public class SuspendEx3 {
    public static void main(String[] args) {
        new  Thread(new Demo()).start();
    }
}
