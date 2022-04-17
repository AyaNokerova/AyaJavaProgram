package com.java.class13;

import java.util.Locale;

public class StringConcatenationAssignment {
    public static void main(String[] args) {
        String s = "Class";
        int a = 12;
        int b = 13;
        System.out.println(a +b + "Class");
        System.out.println(a+b+s);
        System.out.println("Class" + (a+b));
        System.out.println(s+ (a+b));
        System.out.println(s.toUpperCase());
    }
}
