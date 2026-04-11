package org.example.class11;

import java.util.ArrayList;

public class E2Collections {
    static void main() {

        int [] arr={10,20,30,40,50};

        System.out.println(arr[0]);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        System.out.println(numbers);
        System.out.println(numbers.contains(33));
        System.out.println(numbers.isEmpty());


    }
}
