package com.java.class08;
import java.util.Scanner;
public class HomeWork08DivisibleBy5Or3 {
    public static void main(String[] args) {
        System.out.println("Enter number to see if it's divisible by 5 or 3 ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println( num + " is divisible by 5 and 3");}
            else if( num%5==0){
                System.out.println(num + " is divisible by 5");}
            else if(num%3==0){
            System.out.println(num + " is divisible by 3");}
            else {
            System.out.println(num + " is not divisible by 5 or 3");


        }
    }
}