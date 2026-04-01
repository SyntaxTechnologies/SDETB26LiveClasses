package org.example.class8;

public class Dog {
    String name;
    String color;
    int age;

    Dog(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
        System.out.println("The values to the fields have been assigned");
    }

    void printName(){
        System.out.println(name);
    }

    void printColor(){
        String color="Red";
        System.out.println(this.color);
    }

    void printDogInfo(){
        System.out.println(name+" "+color+" "+age);
    }

}
