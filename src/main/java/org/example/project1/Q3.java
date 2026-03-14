package org.example.project1;

import javax.swing.plaf.synth.SynthColorChooserUI;

/*
Create an array to store the scores of six students in a class.
Use a loop to count and print how many scores are above 80
 */
public class Q3 {
    static void main() {


        int [] scores={80,90,95,94,82,75};

        int counter=0;

        for(int s:scores){

            if(s>80){
                counter++;
            }

        }

        System.out.println(counter);
    }
}
