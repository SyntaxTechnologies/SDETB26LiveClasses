package org.example.project2;

/*
You have a list of strings and you want to keep only those that start with “A” and you
want to return them in lower case"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {
    static void main() {

        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");

        List<String> result = new ArrayList<>();

        for (String word : list) {
            if (word.startsWith("A")) {
                result.add(word.toLowerCase());

            }
        }

        System.out.println(result);

    }



}
