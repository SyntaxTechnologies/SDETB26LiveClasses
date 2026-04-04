package org.example.class9;

public class Iphone10 {
    void takePics(){
        System.out.println("Taking Pics using two back cameras");
    }
    void call(){
        System.out.println("Using The Phone app to dial");
    }

    void browseInternet(){
        System.out.println("Using Safari to browse the internet");
    }
}

class Iphone11 extends Iphone10{
    void takePics(){
        System.out.println("Taking Pics using three back cameras");
    }

}