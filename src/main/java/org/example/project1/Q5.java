package org.example.project1;
/*
Write a program that declares two integer variables with values,
and then swaps them using a temporary variable. Print the values
before and after the swap
 */
public class Q5 {
    static void main() {
        int a=10;
        int b=20;
        int temp;
        temp=b;
        b=a;
        a=temp;
        System.out.println("a "+   a);
        System.out.println("b "+   b);

    }
}
