package com.java.gen;

public class SwapExample {

    public static void main(String[] args) {
        int a = 5, b= 7;
        Data<Integer> data = new Data();
        data.swap(a, b);

        Data<String > data2 = new Data();
        String s1 = "Harsh",s2 ="Junaid";
        data2.swap(s1,s2);

        Data<Boolean> data3 = new Data();
        boolean flag1= true, flag2= false;
        data3.swap(flag1,flag2);
    }
}
