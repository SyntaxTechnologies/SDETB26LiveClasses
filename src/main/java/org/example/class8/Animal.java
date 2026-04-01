package org.example.class8;

public class Animal {
    String name;
    String color;
    int age;

    void print(){
        System.out.println(name);
    }

    void printColor(){
        System.out.println(color);
    }
    void printAge(){
        System.out.println(age);
    }

    void printInfo(){
        System.out.println(name+" "+ color+" "+age);
    }
}

class Cat extends Animal{

    void speak(){
        System.out.println("Meow Meow.......");
    }
}

class Horse extends Animal{
    void speak(){
        System.out.println("Neigh Neigh.....");
    }
}