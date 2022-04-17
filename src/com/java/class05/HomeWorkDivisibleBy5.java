package com.java.class05;
import java.util.Scanner;
public class HomeWorkDivisibleBy5 {
    public static void main(String[] args) {
        System.out.println("Check if the number is divisible by 5");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        if (num1 % 5 == 0)
        {
            System.out.println(num1 + "is divisible by5");
        } else {
            System.out.println(num1+ "is not divisible by 5");


        }
        }

    }