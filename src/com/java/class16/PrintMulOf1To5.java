package com.java.class16;

public class PrintMulOf1To5 {
    public static void main(String[] args) {
        int factorial =1;
        for(int i=1; i<=5; i++){
           factorial= factorial*i;
        }
        System.out.println(factorial);
    }
}
