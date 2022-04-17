package com.java.class14;


public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";
        // 1. Check equality of two String
        System.out.println("1.Equality " + str1.equals(str2)); // false

        // 2. Check equality of two String ignoring case
        System.out.println("2.Equality ignoring case " + str1.equalsIgnoreCase(str2));  // true

        //3. Check one String contains another String
        // Contains will check one String contains another String  considering case-sensitive
        System.out.println("3. Contains " + str1.contains(str3));    // false
        System.out.println(str3.contains(str1));    // true
        System.out.println("3.1 Contains " + str3.contains(str2)); // false
// If we want to check one string contains another String ignoring case then we have to change both String
        // in same case and then check contains, so it will check only the contents of two String
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();
        System.out.println(str3LowerCase.contains(str2LowerCase));
        // another variant
        System.out.println(str3.toUpperCase().contains(str1.toUpperCase()));
//============================================================================
        // 4. changing the case of the String
        System.out.println("4. Upper Case " + str3.toUpperCase());
        System.out.println("4.1 Lower Case " + str3.toLowerCase());

        // 5. Find index of character
        str1 = "Hello World";
        System.out.println("5. Index of Char: " + str1.indexOf('W')); //6
        System.out.println("5.1  Last Index of Char: " + str3.lastIndexOf('W')); //13

        // 6. Find character at index
        System.out.println("5.2 Index of Char: " + str1.charAt(0));

        // 7. Length of the String
        str1 = "Hello World";
        str3 = "Hello World! Welcome to DevX!";
        System.out.println("7. Length of String " + str1.length());
        System.out.println("7. Length of String " + str3.length());

        // 8.Empty and Blank
        str1 = "            ";
        str3 = "";
        System.out.println("8. Empty " + str1.isEmpty());
        System.out.println("8. Empty " + str3.isEmpty());

        //9. Replace
        str1 = "Welcome User";
        str3 = "DevX";
        System.out.println("9.Replace: " + str1.replace("User", str3));

        str1 = "TNG 200 TNG 300 ";
        str3 = "USD";
        System.out.println("9.Replace: " + str1.replace("TNG", str3));
        System.out.println("9.ReplaceAll: " + str1.replaceAll("[a-zA-Z  ]", ""));

        System.out.println("==========================================");
        // 10. Format
        str1 = "Welcome %s, Welcome to %s";
        System.out.println("10. Format " + String.format(str1, "Aya", "Ebay"));

        System.out.println("==========================================");

        // 11. Substring
        System.out.println("11. Substring");
        str1 = " Welcome to Java class. Today is fun day";
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(0, 5));

        //12. Split
        System.out.println("=====================");
        System.out.println("12. Split");
        str1 = "Welcome to Java class";
        String[] words = str1.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

        str2 = "Weather is beautiful today";

        String[] word = str2.split(" ");

      System.out.println(word.length);
      for(int i =0; i<word.length; i++)
       System.out.println( word[i]);

        str3 = "I work at Wells Fargo. I have 5 years of experience";
        String[] word1 = str3.split(" ");
        System.out.println(word1.length);   // 11 words
        for (int i = 0; i < word1.length; i++)
            System.out.println(word1[i]);


    }
}
