package com.java.class09;

public class HomeWork09 {
    public static void main(String[] args) {
       // ========================== Find Output of Below Program ================
        int i = 4, j = 4, k = 4;
       int m = i++ + j-- + --k;
        System.out.println(i); // 5
        System.out.println(j);// 3
        System.out.println(k); // 3
        System.out.println(m);  // 11
//========================== Find Output of Below Program ================
//        int i = 4, j = 4, k = 4;
//        int m = ++i + ++j + --k;
//        System.out.println(i); // 5
//        System.out.println(j);  // 5
//        System.out.println(k);  // 3
//        System.out.println(m);  // 13
//========================== Find Output of Below Program ================
//        int i = 4, j = 4, k = 4;
//        i = j++ + --k;
//        int m = i + j + k;
//        System.out.println(i); //  7
//        System.out.println(j); // 5
//        System.out.println(k); // 3
//        System.out.println(m); // 15
//========================== Find Output of Below Program ================
//        int i = 4, j = 4, k = 4;
//        i=j++;
//        j=k++;
//        k=--i;
//        int m = i + j + k--;
//        i = 4     i = 4   i= 3
//        j=  5    j=  4   j=4
//        k= 4     k = 5    k=  3  k =2
//        m= 3+4+3=10
//        System.out.println(i); // 3
//        System.out.println(j); //  4
//        System.out.println(k);  // 2
//        System.out.println(m); //  10
//
// 5 3 3 11
// 5 5 3 13
// 7 5 3 15
// 3 4 2 10
    }
}
