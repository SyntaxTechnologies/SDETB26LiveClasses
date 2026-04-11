package org.example.class11;

public abstract class Vehicle {
    //  String color;
    String color;
    String make;
    String model;

    Vehicle(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    abstract void drive();

    void playMusic() {
        System.out.println("Playing music");
    }

    static void  applyBrakes(){
        System.out.println("Applying brakes");
    }

}
