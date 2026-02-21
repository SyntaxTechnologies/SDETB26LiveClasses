package org.example.class3;

public class E13 {
    public static void main(String[] args) {
        /*
        + - * / help us do mathematical operations
        += -= *= /= Compound us do mathematical quickly
        > >= < <= == != compare numbers
        || && ! help combine conditions
         */

       int age=25;
       boolean voteRegistered=true;
       if(age>=18){
           if(voteRegistered){
               System.out.println("You can vote");
           }else {
               System.out.println("You can't vote");
           }
       }else {
           System.out.println("You can't vote");
       }


    }
}
