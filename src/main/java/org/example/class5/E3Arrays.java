package org.example.class5;

public class E3Arrays {
    public static void main(String[] args) {

        int[] numbers={10,20,30,33,40,40,33,20,10,15,30,22,20};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        char [] companyName={'s','y','n','t','a','x'};
        // write a loop to pull all of chars from this array
        for(int counter=0;counter<companyName.length;counter++){
            System.out.print(companyName[counter]);
        }


    }
}
