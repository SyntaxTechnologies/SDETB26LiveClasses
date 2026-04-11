package org.example.class11;

import java.util.ArrayList;

public class E4Collections {
    static void main() {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");

        for(String f:fruit){
            System.out.println(f);
        }

        for(int i=0;i<fruit.size();i++){
            System.out.println(fruit.get(i));
        }






    }
}
