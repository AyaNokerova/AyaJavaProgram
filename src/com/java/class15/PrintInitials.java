package com.java.class15;
import java.util.Scanner;
public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = sc.nextLine();
         String parts[] = fullName.split(" ");
         String firstName = parts[0];
         String middleName = parts [1];
           String lastName = parts [2];
        System.out.println(firstName.charAt(0)+ "." + middleName.charAt(0)+ "." + lastName.charAt(0));
            }
        }
//   System.out.println(fullName.charAt(0) +"." +fullName.charAt(8));
//         System.out.println(Character.toUpperCase(fullName.charAt(0)));
//        for (int i = 0; i < fullName.length() - 1; i++) {
//            if (fullName.charAt(i) == ' ') {
//                System.out.println("." + Character.toUpperCase(fullName.charAt(i + 1)));
//
//