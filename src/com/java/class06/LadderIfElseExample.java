package com.java.class06;
// write a program when user enter any number from 0 to 6
// print days of week
// 0-Sunday
import java.util.Scanner;
public class LadderIfElseExample {
    public static void main(String[] args) {
        // input
        System.out.println("Enter any number from 0 to 6 ");
        Scanner sc = new Scanner (System.in);
        int dayNum = sc.nextInt();

        if(dayNum==0) {
            System.out.println("sunday");
        }else if (dayNum==1){
            System.out.println("monday");
        }else if(dayNum==2){
            System.out.println("tuesday");
        }else if(dayNum ==3){
            System.out.println("wednesday");
        }else if(dayNum== 4){
            System.out.println("thursday");
        }else if(dayNum==5){
            System.out.println("friday");
        }else if(dayNum==6){
            System.out.println("saturday");
        }




       }
}
