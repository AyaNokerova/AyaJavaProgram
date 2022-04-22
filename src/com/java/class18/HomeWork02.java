package com.java.class18;

public class HomeWork02 {
    public static void main(String[] args) {
//  Write a program to print all even numbers which are divisible by 6 from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (isDivBy6(i) == true) {
                System.out.println(i);
            }
        }
    }

    static boolean isDivBy6(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % 6 == 0) {
                count++;
            }
        }
        if (count > 5) {
            return true;
        } else {
            return false;

        }
    }
}