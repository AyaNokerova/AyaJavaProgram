package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "B604, Cosmos Society, Magarpatta City, Pune, 411013";
        String[] word = address.split( ",");
        System.out.println(word.length);
        for(int i =0; i < word.length; i++)
            System.out.println(word[i].trim());





    }
}
