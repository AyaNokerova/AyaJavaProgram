package com.java.class04;
// If we do addition with String it will be concatenation
// String+ String= StringString (concea
public class StringExample {
    public static void main(String[] args) {
        int a=10, b=20, c=30;
        String str1 ="Hello";
        String str2= "Java";
        System.out.println("a+b"); // Because its String
        System.out.println("a"+20); // a20
        System.out.println("a"+20+30); //a2030
        System.out.println(a); // 10
        System.out.println(a+b); //30
        System.out.println(str1); // Hello
        System.out.println(str1+str2); // Hello Java
        System.out.println(str1+a); // Hello10
        System.out.println(str1+a+b); // Hello1020 (Left to right)
        System.out.println(a+b+str1); //30Hello   (Left to right)
        System.out.println(a+str1+b); //10Hello20
        System.out.println(str1+a*b); // Hello200 * first and then +
         //   System.out.println(str1+a-b);
        System.out.println(a-b+str1);




    }
}
