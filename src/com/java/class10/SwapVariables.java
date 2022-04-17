package com.java.class10;
import java.util.Scanner;
public class SwapVariables {
    public static void main(String[] args) {
//        int a = 10, b = 20;
//      a =b;
//      b=a;
//        System.out.println(a); // 20
//        System.out.println(b); //20

// ==============================================
//         int a = 10, b = 20;
//         int c;
//         c = a;
//         a= b;
//         b =c;
//        System.out.println(a);  //20
//        System.out.println(b);  //10
//===============================================
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt();
        int c;
        c =a;
        a= b;
        b= c;
        System.out.println(a);
        System.out.println(b);
// ===============================================
//        a = 10,  b= 20;
//        a = a+b;
//        b = a- b;
//        a = a- b;   without using third variable

//================================================
//        a = 20, b= 10;
//        a = a*b;  a = 20  *  10=200
//        b = a/b;  b = 200 / 10= 20
//        a=a /b;   a = 200 / 20= 10        using multiplication
    }
}
