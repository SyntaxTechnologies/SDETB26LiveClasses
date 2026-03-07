package org.example.class5;

public class E15EFL {
    public static void main(String[] args) {

        double[] prices={10.0,20.5,1.5,2.5,3.2,4.3,5.5};
        for (double p:prices){

            if(p==1.5){
                break;
            }

            System.out.println(p);
        }

    }
}
