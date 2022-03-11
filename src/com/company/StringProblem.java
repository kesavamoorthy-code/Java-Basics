package com.company;

import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args)
    {
        // Comma seperated line
        // Replace a word or character in a line
        // find no of occurence of word
        // String is palindrome or not

        // ------------------------Seperated by regex --------------------------
        String ln = "one;of;the;test;cases;for;comma;seperted;text";
        String[] str ;
        str = ln.split(";");
        for(String s: str )
        {
            System.out.println("comma seperated:" + s);
        }
        //-----------------------Sperated by regex ----------------------------
        // ------------------ Palindrome ---------------------------------------
//      String pal = "ABABA";
        Scanner sc = new Scanner(System.in);
        String pal = sc.next();
        System.out.println("Input string: " + pal);
        int l,f=0;

       l = pal.length();
        int last = l -1;
//        l = l -1;
        if( l % 2 == 0)
        {
            while( last > f )
            {
                if(pal.charAt(f) == pal.charAt(last))
                {
                    f++; last -- ;
                }
                else{
                    System.out.println("Not a palindrome");
                    break;
                }

            }
            System.out.println("Ita a palindrone:");

        }
        else{
        if( l % 2 !=0){
            while(last != f)
            {
                if(pal.charAt(f) == pal.charAt(last))
                {
                    f++; last -- ;
                }
                else{
                    System.out.println("Not a palindrome");
                    break;
                }

            }
            System.out.println("Ita a palindrone:");
        }
        }
        // ------------------ Palindrome ---------------------------------------

    }
}
