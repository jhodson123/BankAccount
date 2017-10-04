package com.company;

/**
 * Created by jh424 on 10/4/17.
 */
public class BankAccount {

    public double balance;
    public String name;
    public BankAccount(String n, double b){

        balance = b;
        name = n;
    }

    public void Deposit(double d){

        balance += d;
    }

    public void Withdraw(double w){

        if (w > balance){
            System.out.println("You can't withdraw that much... you will go into debt");
        }else
        balance -= w;
    }
}
