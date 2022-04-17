package com.java.class11;
import java.util.Scanner;
public class BrainStormingWhileExample {
    public static void main(String[] args) {
//        int i =0;
//        while(i<=60){
//            System.out.println(i); // Output  1 2 4 8
//            i=i+6; }
//
//        int i =1;
//        int j = 6;
//        while( i<=5){
//            System.out.println(j*i);
//            i++; }
//
//      int i =1;
//      while (i<=60){
//          if(i%6==0){
//              System.out.println(i);
//          }
//          i++;
//      }
      Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers we need to print");
      int num = sc.nextInt();
      int i=1;
      while(i<=num){
          System.out.println(i*6);
          i++;
      }
        }
    }

