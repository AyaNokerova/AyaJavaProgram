package com.java.class06;

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        System.out.println("Enter number to check if it is + or - ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if(num>0){

            System.out.println("positive");
        }else if(num<0) {
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}
