package com.java.jdk8;

@FunctionalInterface
interface IStrEx {
    int length(String sr);
}

class StrOps {
    public int strLen(String str) {
        int len =0;
        char[] ch = str.toCharArray();
        for (char c : ch) {
            len++;
        }
        return len;
    }
}

public class MethodRefEx2 {
    public static void main(String[] args) {
        StrOps str = new StrOps();
        IStrEx iStr = str::strLen;
        System.out.println("Length of String is   " +iStr.length("Shaili"));
    }
}
