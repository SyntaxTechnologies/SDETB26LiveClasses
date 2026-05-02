package org.example.project2;

/*
Write a program to swap 2 String without a temporary variable?

 */

public class Q1 {
    static void main() {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swapping without a temporary variable
        str1 = str1 + str2; // str1 now contains "HelloWorld"
        str2 = str1.substring(0, str1.length() - str2.length()); // str2 now contains "Hello"
        str1 = str1.substring(str2.length()); // str1 now contains "World"

        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
