package com.java.class07;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("Enter number from 0-5;");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                case 2:
                System.out.println("two");
                case 3:
                System.out.println("three");
                case 4:
                System.out.println("four");
                case 5:
                System.out.println("five");
                break;
            default :
                System.out.println("Please enter number from 0-5");

        }
    }
}