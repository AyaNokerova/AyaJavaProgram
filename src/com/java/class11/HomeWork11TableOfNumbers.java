package com.java.class11;
import java.util.Scanner;
public class HomeWork11TableOfNumbers {
    public static void main(String[] args) {
//        ============= Homework =======================
//        1. Write a program to print table of given number. If user enters 3 then print table of 3 like below
//        3 6 9 12 15 18 21 24 27 30

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int a = 1;
        while (a <= 10) {
            System.out.println(a * num);
            a++;
        }
    }
}