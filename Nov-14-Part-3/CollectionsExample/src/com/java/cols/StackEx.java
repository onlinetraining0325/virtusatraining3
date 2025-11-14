package com.java.cols;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(14);
        stack.push(53);
        stack.push(63);
        stack.push(73);
        stack.push(83);
        stack.push(93);

        System.out.println("Stack Elements Are  ");
        for(Object o : stack){
            System.out.println(o);
        }

        stack.pop();
        stack.pop();
        System.out.println("Stack Elements Are  ");
        for(Object o : stack){
            System.out.println(o);
        }

    }
}
