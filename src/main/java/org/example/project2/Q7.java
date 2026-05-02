package org.example.project2;

/*
Count the Number of Words in a String: Write a function to count the number of words
in a given string. Words are separated by spaces or punctuation. For example, the input
"Hello, world!" should return 2
 */

public class Q7 {
    static void main() {

        String str = "Hello, world! This is a test.";
        int wordCount = countWords(str);
        System.out.println("Original string: " + str);
        System.out.println("Number of words: " + wordCount);

    }
    public  static int countWords(String str) {
        // Use regex to split the string into words based on spaces and punctuation
        String[] words = str.split("[\\s\\p{Punct}]+");
        return words.length;
    }
}
