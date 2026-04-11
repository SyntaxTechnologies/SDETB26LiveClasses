package org.example.class11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class E6Collections {
    static void main() {

        LinkedList<String> fruit=new LinkedList<>();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");

        //fruit.removeIf(x->x.contains("a"));
        fruit.removeIf(x->x.endsWith("e"));
        System.out.println(fruit);






    }
}
