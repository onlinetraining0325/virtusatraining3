package com.java.thr;

import java.util.Scanner;

class Hello  extends Thread{
    public void run(){
        String ch;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I value  " +i);
            if (i==6) {
                System.out.println("Suspended");
                suspend();


                System.out.println("Shall I Resume (Y/N)  ");
                ch = sc.next();
                if (ch=="Y" || ch=="Y") {
                    resume();
                }
            }
        }
    }
}

public class SuspendEx2 {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.start();
    }

}
