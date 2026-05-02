package org.example.project2;

import java.util.Arrays;

/*
Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
meaning they contain the same characters in a different order. For example, "listen"
and "silent" are anagrams.
 */
public class Q5 {
    static void main() {

        String str1 = "listen";
        String str2 = "silent";


        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }


    }


}
