package org.example.project1;
/*
Create a program that uses an array to store the names of five fruits,
and then uses a loop to print each fruit name on a new line
 */
public class Q1 {
    static void main() {

        String [] fruits={"Apple","Mango","Orange","Kiwi","Banana"};

        for(String f:fruits){
            System.out.println(f);
        }

    }
}
