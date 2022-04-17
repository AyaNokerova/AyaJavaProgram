package com.java.class07;

import java.util.Scanner;

public class PrintNumberOfDaysInMonthUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Enter month January-December;");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        switch (month) {
            case "January":
            case "May" :
            case "March":
            case  "July":
            case  "August":
            case "December" :
            case "October":
                System.out.println("31 days");
                break;
            case "February":
                System.out.println("28-29 days");
                break;


            case "April":
            case "June" :
            case "September":
            case "November":
                System.out.println("30 days");
                break;
                default:
                System.out.println("Please enter the month with Capital letter");
        }
    }
}