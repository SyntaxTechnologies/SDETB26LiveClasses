package org.example.project2;

/*
Create a method to count how many vowels are present in a string “documentation”
 */

public class Q6 {
    static void main() {

        String str = "documentation";
        int vowelCount = countVowels(str);
        System.out.println("Original string: " + str);
        System.out.println("Number of vowels: " + vowelCount);
    }
    public static int countVowels(String vowels) {
        // Include uppercase vowels if needed
        vowels=vowels.replaceAll("[^aeiouAEIOU]", ""); // Remove non-vowel characters
        System.out.println(vowels);
        return vowels.length();
    }
}
