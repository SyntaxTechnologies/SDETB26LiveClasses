package org.example.class14;

public class E1Exceptions {
    static void main() {

        System.out.println("step1");
        System.out.println("step2");
        System.out.println("step3");
        try
        {
            System.out.println(10 / 2);
        }
        catch (Exception e)
        {

            System.out.println("Something bad happened at line 18");
        }
        System.out.println("step4");
        System.out.println("step5");
        System.out.println("step6");


    }
}
