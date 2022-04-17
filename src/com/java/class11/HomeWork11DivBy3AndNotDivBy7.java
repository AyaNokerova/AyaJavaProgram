package com.java.class11;

import java.util.Scanner;

public class HomeWork11DivBy3AndNotDivBy7 {
    public static void main(String[] args) {
  //      3. Write a program to print numbers that are not divisible by 3 and divisible by 7 (edited)
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the limit ");
        int num = sc.nextInt();

        int c = 1;
        while (c <= num) {
            if (c % 3 != 0 && c % 7 == 0) {
                System.out.println(c);
            }
            c++;
        }
    }
}