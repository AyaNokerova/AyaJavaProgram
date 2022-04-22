package com.java.class18;

public class HomeWork01 {
    public static void main(String[] args) {
// Write a program to print all numbers from 1 to 50 which has more than 5 divisor
        for(int i=1; i<=50; i++){
            if(isMoreThan5(i)==true) {
                System.out.println(i);
            }
        }
    }
    static boolean isMoreThan5(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
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
