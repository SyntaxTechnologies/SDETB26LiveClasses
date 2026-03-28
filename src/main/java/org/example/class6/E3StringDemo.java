package org.example.class6;

public class E3StringDemo {
    static void main() {

        String firstName="John";
        String lastName="            Adam        ";

        String cleanedLastname=lastName.trim();
       // String fullName=firstName+" "+lastName;
        String fullName=firstName+" "+cleanedLastname;
        System.out.println(fullName);
    }
}
