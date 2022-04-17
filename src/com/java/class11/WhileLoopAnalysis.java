package com.java.class11;
import java.util.Scanner;
public class WhileLoopAnalysis {
    public static void main(String[] args) {
        // 3 Important parts of While Loop Initialization, Condition, Increment/Decrement
       Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

//        int i = 1;
//        int j =10;
//        while(i<=limit){
//
//            System.out.println(j);
//            System.out.println(i);
//            i++;
//            j--;


//            int i = 1;
//
//            while (i <=limit) {
//                System.out.println(11-i);
//                System.out.println(i);
//                i++;

        int i = 1;       /// for even numbers only
       while(i<=limit/2){
            System.out.println(11-i);
           System.out.println(i);
           i++;



//           int limit = sc.nextInt();
//           int i=1;
//           int x=0;
//           while(i<=limit){
//               if(i%2==0){
//                   x = i/2;
//                   System.out.println(x);
//               } else {
//                   System.out.println(10-x);
//               }
//               i++;
       }
    }
}
