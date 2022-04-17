package com.java.class07;

import java.util.Scanner;

public class HomeWorkVowelCheck {
    public static void main(String[] args) {
        System.out.println("Please check if the given character is vowel or not");
        Scanner sc =new Scanner(System.in);
        char myChar   = sc.next().charAt(0);
switch (myChar){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        System.out.println("This character is a vowel");
        break;
    default:
    System.out.println("This character is not a vowel" );
}
    }
}
