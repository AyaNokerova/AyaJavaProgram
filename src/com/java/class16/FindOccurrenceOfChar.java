package com.java.class16;
import java.util.Scanner;
public class FindOccurrenceOfChar {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c ='a';
        char c2 = 'A';
        int count=0;
        for (int i=0; i<str.length();i++){
          if((str.charAt(i)== c ) || (str.charAt(i)== c2 )){
              count++;
          }

        }
        System.out.println(count);
    }
}
//public class FindOccurrenceOfChar {
//    public static void main(String[] args) {
//        String str = "This is my Java program";
//        char c ='a';
//        char c2 'A';
//        int result =0;
//        for (int i=0; i<str.length();i++){
//            if((str.charAt(i)== c ) || (str.charAt(i)== c2 )){
//                result++;
//            }
//
//        }
//        System.out.println(result);
//    }
//}
