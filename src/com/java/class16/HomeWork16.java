package com.java.class16;
import java.util.Scanner;
public class HomeWork16 {
    // write a program to find out divisor of given number
    public static void main(String[] args) {
        // find divisor of give number
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        for (int i =1;i <= num; i++){
            if(num%i==0 ){
                System.out.println(i);
            }
        }
    }

}
