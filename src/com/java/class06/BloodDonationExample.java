package com.java.class06;
// nested condition
// nested if else

import java.util.Scanner;

public class BloodDonationExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.println("Enter your age");

        int age = sc.nextInt();
        System.out.println("Enter your weight");
        int weight = sc.nextInt();
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible");
            } else {
                System.out.println("You are under weight");
            }
        } else {
            if (weight >= 50) {
                System.out.println("You are too young");
            } else {
                System.out.println("You are totally not eligible");
            }
        }
    }
}
