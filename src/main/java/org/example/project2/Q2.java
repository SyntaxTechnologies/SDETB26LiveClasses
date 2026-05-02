package org.example.project2;

//Find out how many alpha characters are present in a string?

public class Q2 {
    static void main() {

        String str = "Hello World! 123";

       //use regex to remove non-alpha characters and count the remaining characters
        String alphaOnly = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("Original string: " + str);
        System.out.println("String with only alpha characters: " + alphaOnly);
        System.out.println("Number of alpha characters: " + alphaOnly.length());

    }
}
