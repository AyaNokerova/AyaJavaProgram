package com.java.class11;

public class HomeWork11DivisibleBy3And5 {
    public static void main(String[] args) {
      //  Write a program to print numbers that are divisible by 3 and 5 from 1 to 50

        System.out.println("Enter number to check if it is divisible by 3 and 5");

        int a =1;
        while (a <= 50) {
            if (a%3==0 && a%5==0) {
                System.out.println(a);
            } a++;
        }
    }
}
