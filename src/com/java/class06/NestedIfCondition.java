package com.java.class06;

public class NestedIfCondition {
    public static void main(String[] args) {
        int a = 7;
        if (a >= 10) {
            System.out.println("0");
            if (a != 11) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }else{
            System.out.println("3");
        }
    }
}