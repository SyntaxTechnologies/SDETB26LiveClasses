package org.example.class11;

import java.util.ArrayList;

public class E5Collections {
    static void main() {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");

        //fruit.removeIf(x->x.contains("a"));
        fruit.removeIf(x->x.endsWith("e"));
        System.out.println(fruit);






    }
}
