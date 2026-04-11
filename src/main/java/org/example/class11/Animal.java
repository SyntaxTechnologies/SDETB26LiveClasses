package org.example.class11;

public interface Animal {
    void speak();
    void eat();
    void sleep();

}

class Dog implements Animal {

    public void speak() {
        System.out.println("Wuff Wuff");
    }


    public void eat() {
        System.out.println("Eating.....");
    }


    public void sleep() {
        System.out.println("ZZZzzzZZZZzzz......");
    }

}

class Cat implements Animal{
    public  void speak(){
        System.out.println("Meow Meow");
    }
    public  void eat(){
        System.out.println("Eating fish");
    }
    public void sleep(){
        System.out.println("ZZZzzzZzzzzzz........");
    }
}