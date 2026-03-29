package org.example.class7;

public class BankAccount {
    private static String userName = "User123";
    private static String password = "Pass123";
    static String accountTitle="John Adam";
    public static String accountNumber="123456789";

   public static void printBankName(){
        System.out.println("Chase Bank");
    }


    static void main() {

        System.out.println(BankAccount.userName);
        System.out.println(BankAccount.accountTitle);
        System.out.println(BankAccount.accountNumber);
    }
}
