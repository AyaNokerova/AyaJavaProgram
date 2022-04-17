package com.java.class07;
import java.util.Scanner;
public class HomeWorkFindCompanyName {
    public static void main(String[] args) {
        System.out.println("Please enter name of the product");
        Scanner sc =new Scanner(System.in);
        String product = sc.nextLine();
        // Possible inputs:       Possible Outputs:
        //WhatsApp                 Facebook
        //YouTube                  Microsoft
        //HangOuts                 Google
        // Skype
        // Outlook
        //Gmail
        switch (product){
            case "Youtube" :
            case "Hangouts" :
            case "Gmail" :
        System.out.println("This product belongs to Google");
        break;
            case "WhatsApp":
            case "Instagram" :
                System.out.println("This product belongs to Facebook");
         break;
            case "Outlook":
            case "Skype" :
                System.out.println("This product belongs to Microsoft");
            default:
                System.out.println("Please enter valid product name");

}
    }
}
