package com.java.class05;
import java.util.Scanner;
public class HomeWorkLeapYear {
    public static void main(String[] args) {
        System.out.println("Enter any Year");
        Scanner sc = new Scanner(System.in);
      int year = sc.nextInt();
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else
                isLeap = true;
        }
        if (isLeap )
            System.out.println(year + " is a Leap Year");

else
        System.out.println(year + " is not a Leap Year");
    }
}