package org.example.project1;
/*
Create an array of five integer values. After the array is created,
use a loop to calculate and print the average of all the elements.
 */
public class Q2 {
    static void main() {

        int [] values={10,20,33,23,22};
        // explicitly making it double so that we do not lose decimal part of the answer
        double sum=0;
        for(int n:values){
        sum=sum+n;
        }
        double avg=sum/values.length;
        System.out.println(avg);
    }
}
