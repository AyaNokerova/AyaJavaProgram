package com.java.class06;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        System.out.println("enter month by numbers 1-12");
        Scanner sc = new Scanner (System.in);
        int month = sc.nextInt();

         if(month==1) {
            System.out.println("January -31 days");}
         if(month==2) {

        System.out.println("February- 28/29 days");}
        if(month==3){
        System.out.println("March -31 days");}
       if(month==4){
        System.out.println("April -30 days");}
       if(month==5){
        System.out.println("May -31 days");}
       if(month==6){
        System.out.println("June -30 days");}
       if(month==7){
        System.out.println("July -31 days");}
       if(month==8){
        System.out.println("August -31 days");}
       if(month==9){
        System.out.println("September -30 days");}
       if(month==10){
        System.out.println("October -31- days");}
       if(month==11){
        System.out.println("November -30days");}
       if(month==12){
        System.out.println("December -31 days");}


    }
}
