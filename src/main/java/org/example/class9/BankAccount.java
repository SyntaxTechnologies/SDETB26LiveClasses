package org.example.class9;

import java.util.AbstractCollection;

public class BankAccount {
    private String name;
    private String userName;
    private String password;
    private double accountBalance = 10000;

    void setBalance(double accountBalance){
        this.accountBalance= accountBalance;
    }

    double getBalance(){
        return  accountBalance;
    }

}
