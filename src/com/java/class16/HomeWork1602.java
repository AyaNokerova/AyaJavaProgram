package com.java.class16;

public class HomeWork1602 {
    // Find result of given series 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum = sum - i;
            } else {
                sum = sum + 1;
            }
            System.out.println(sum);

        }
    }
}