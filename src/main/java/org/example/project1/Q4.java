package org.example.project1;

import java.util.Scanner;

/*
Write a program that takes two numbers as input and prints their
sum, difference, product,and division without using any extra variables for calculations
 */
public class Q4 {
    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the first number");
        double firstNumber=scanner.nextDouble();
        System.out.println("Please Enter the second number");
        double secondNumber=scanner.nextInt();

        System.out.println("Sum: "+(firstNumber+secondNumber));
        System.out.println("difference: "+(firstNumber-secondNumber));
        System.out.println("product: "+(firstNumber*secondNumber));
        System.out.println("division: "+(firstNumber/secondNumber));





    }
}
