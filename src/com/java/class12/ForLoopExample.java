package com.java.class12;

public class ForLoopExample {
    public static void main(String[] args) {
// print 2 4 6 8 10
        for (int i = 2; i <= 5; i++) { //initialization   condition   increment/decrement
            if (i % 2 == 0) {
                System.out.println(i);  // body
            }
        }

        for (int i = 1; i <= 10 / 2; i++) {
            System.out.println(i * 2);
        }
    }
}
