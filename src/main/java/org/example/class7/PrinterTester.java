package org.example.class7;

public class PrinterTester {
    static void main() {
        Printer pOBJ = new Printer();
        pOBJ.print("Adam", 10, 20.5);
        // we need the follow the same order for parameters
        // p.print(10,20.5,"Adam");
        String fName = pOBJ.printFullName("Muhammad", "Ali");
        System.out.println("Mr. " + fName);
    }
}
