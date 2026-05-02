package org.example.project2;
/*
How can you remove all duplicates from ArrayList?
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q9 {
    static void main() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(30);
        Set<Integer> set = new HashSet<>(list);
        list=new ArrayList<>(set);
        System.out.println(list);
    }
}
