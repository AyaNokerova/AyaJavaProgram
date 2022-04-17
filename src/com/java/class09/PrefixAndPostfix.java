package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {

//        int i = 5;
//        int j =i++;
//        System.out.println(j); 6
//        System.out.println(i); 5

//        int i =1;
//        int j =i++;
//        System.out.println(i); 2
//        System.out.println(j); 1

//        int i =1;
//        int j =4;
//        int k =j++ +i;
//        System.out.println(i); 1
//        System.out.println(j); 5
//        System.out.println(k);  5

//        int i =1;
//        int j =4;
//        int k = i++ + j++;
//        System.out.println(i); //2
//        System.out.println(j);  //5
//        System.out.println(k); //5
//

//
//        int i =1;
//       int j =4;
//        int k = i +j;
//        i++;
//        j++;

//        System.out.println(i); //2
//       System.out.println(j); // 5
//       System.out.println(k);  //5

//        int i =1;
//        int j =4;
//        i++;
//        j++;

//        int k = i +j;
//        System.out.println(i); //2
//      System.out.println(j); // 5
//       System.out.println(k); //7
//
//        int i =1;
//        int j =4;
//
//        int k = ++j + i++;
//        System.out.println(i); //2
//    System.out.println(j); //5
//       System.out.println(k);  //6

//
//        int i =1;
//        int j =4;
//
//        int k =  i++ + ++j;
//        System.out.println(i); //2
//        System.out.println(j);  //5
//        System.out.println(k);   //6

//        int i =1;
//        int j =4;
//
//        int k =  i++ + ++j + i ;
//        System.out.println(i); //2
//        System.out.println(j);  //5
//        System.out.println(k);   //8
//
//        int i =0;
//        int j =0;
//        int m = 0;
//
//        int k =  i++ + j++ + ++m ;
//        System.out.println(i);  1
//        System.out.println(j); 1
//        System.out.println(m); 1
//        System.out.println(k); 1

//        int i =0;
//        int j =0;
//
//
//        int k =  i++ + j++  ;
//      int m= k++;
//        System.out.println(i); //1
//        System.out.println(j); //1
//        System.out.println(m); //0
//        System.out.println(k); //1

        int i =4;
        int j =4;
        int k =  i++ + --j;
        int m= k++ - i++;
        System.out.println(i); // 6
        System.out.println(j); // 3
        System.out.println(m); // 2
        System.out.println(k); // 8

    }

}
