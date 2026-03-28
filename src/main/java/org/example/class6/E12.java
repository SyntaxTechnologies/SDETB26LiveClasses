package org.example.class6;

public class E12 {
    static void main() {
        String str="12345678@$%^%^Q22WRTTYYa32sdfr22tg";

        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[0-5]","*"));
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[a-z0-9]","*"));
        System.out.println(str.replaceAll("[a-zA-Z0-9]","*"));
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","*"));
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(str.replaceAll("[a-z]",""));

    }
}
