package org.example.project2;

/*
Check if a String is Palindrome: Determine whether a given string is a palindrome,
which means it reads the same forwards and backward. For example, "madam" is a
palindrome
 */


public class Q4 {
    static void main() {

        // car  rac
        // madam  madam
        String str = "car";
        String reversed = reverseString(str);
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);

        return reversed.reverse().toString();
    }
}
