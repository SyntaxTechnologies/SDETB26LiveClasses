package org.example.project2;

/*
Reverse a String: Write a function to reverse a given string. For example, given the
input "Hello", the output should be "olleH".
 */

public class Q3 {
    static void main() {

        String str = "Hello";  //olleH
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);

        return reversed.reverse().toString();
    }
}
