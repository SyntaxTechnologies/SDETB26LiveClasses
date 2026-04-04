package org.example.class9;

public class Wood {
    String color="Brown";
}

class Furniture extends Wood{
    String color="White";
}

class Chair extends Furniture{

    String color="Off-White";
    void printColor(){
        String color="Yellow";
        System.out.println(super.color);
    }
}
