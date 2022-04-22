package com.java.class17;
import java.util.Scanner;

public class MethodExample {
    static void printLine(){
        System.out.println("================================================");
    }
    public static void main(String[] args) {
        printLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number ");
        printLine();
        int a = sc.nextInt();

        printLine();
        System.out.println("Please enter second number ");
        printLine();
        int b = sc.nextInt();


        System.out.println("Please enter the operation (Add/ Div/ Sub/ Mul)");
        String operation = sc.next();
        printLine();

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println(a + b);
                break;
            case "sub":
                System.out.println(a - b);
                break;
            case "div":
                System.out.println(a / b);
                break;
            case "mul":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Invalid choice...please try after hangout");
        }
    }
}
