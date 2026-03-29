package org.example.class7;

public class E4Variables {
    // instance variables
    String firstName="John";

    void printName(){

        System.out.println(firstName);
    }

    void printFullName(){
       // Local Variables
        String lastName="Adam";
        System.out.println(firstName+lastName);
    }
}
