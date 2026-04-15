package org.example.class12;

import java.util.Set;
import java.util.TreeSet;

public class E4Sets {
    static void main() {

        Set<Integer> numbers=new TreeSet<>();
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);

        for(int n:numbers){
            System.out.println(n);
        }










    }
}
