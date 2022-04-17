package com.java.class07;
import java.util.Scanner;
public class HomeWorkUsernameAndPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sign In");
        System.out.println("Enter your Username");
        String Username1 = sc.nextLine();
        System.out.println("Enter your Password");
        String Password1 = sc.nextLine();
        if (Username1.equals("Aya01") && Password1.equals("Nokerova01")) {
            System.out.println("Login Successful!!!");
        } else if (!Username1.equals("Aya01") && (Password1.equals("Nokerova-01"))) {
            System.out.println("Invalid Username");
        } else if (Username1.equals("Aya01") && (!Password1.equals("Nokerova-01"))) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Login Unsuccessful!!");
        }
    }
}