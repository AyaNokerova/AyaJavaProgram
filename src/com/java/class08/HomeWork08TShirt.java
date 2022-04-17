package com.java.class08;
import java.util.Scanner;
public class HomeWork08TShirt {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("Enter number from 27 to 50  size to find out your T-Shirt size");

        int num = sc.nextInt();
        if(num>=27 && num<=30){
            System.out.println("  Your T-Shirt size is XS");}
        else if(num>=31 && num<=34){
            System.out.println("  Your T-Shirt size is S");}
        else if  (num>=35 && num<=38){
            System.out.println(" Your T-Shirt size is M");}
        else if(num>=39 && num<=42){
            System.out.println(" Your T-Shirt size is L");}
         else if(num>=45 && num<=50){
            System.out.println("  Your T-Shirt size is XL");}
        else if(num>=50 && num<=55){
            System.out.println(" Your T-Shirt size is XXL");

            }

        }
    }


