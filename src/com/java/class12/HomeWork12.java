package com.java.class12;

public class HomeWork12 {
    public static void main(String[] args) {
        // find out result of below series
        // 1*2*3*4*5
        int factorial = 1;
        for(int i =1; i<=5; i++) {

            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
