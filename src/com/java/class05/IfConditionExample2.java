package com.java.class05;

public class IfConditionExample2 {
    public static void main(String[] args) {
        int batteryPercentage = 1;

        System.out.println("1.Playing game");
        if (batteryPercentage == 1) { // if ==1 123 will be executed
            System.out.println("2.Switching off");
        } else {
            System.out.println("3.Locking phone");
        }
    }
}