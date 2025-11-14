package com.java.ex;

public class ArrayEx {

    public static void main(String[] args) {
        int[] a = new int[]{12,4};
        try {
            a[10]=882;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Size is Small...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
