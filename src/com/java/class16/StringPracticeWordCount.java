package com.java.class16;

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println(words.length);

    }
}
// Hello, this is my first Java String program
