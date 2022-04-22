package com.java.class16;
import java.util.Scanner;
public class StringDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str ="Hello";
       // String Buffer uses the buffer mechanism to protect data from being access and update simultaneously, so its thread-safe
        StringBuffer sBuffer =new StringBuffer("Hello");
        sBuffer.reverse();

      // String Builder does not have buffer mechanism, so it is faster than StringBuffer
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
    }
}
