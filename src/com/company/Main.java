package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("What is your name:");
        String n = input.nextLine();
        System.out.println("What is your starting balance:");
        double b = input.nextDouble();
        BankAccount myAccount = new BankAccount(n, b);

        while (running) {

            System.out.println("What would you like to do:");
            String s = input.next();
            if (s.toLowerCase().contains("withdraw")) {

                System.out.println("How much would you like to withdraw:");
                double d = input.nextDouble();
                myAccount.Withdraw(d);
            }else if (s.toLowerCase().contains("deposit")) {

                System.out.println("How much would you like to deposit:");
                double d = input.nextDouble();
                myAccount.Deposit(d);
            }else if (s.toLowerCase().contains("balance")) {

                System.out.println(myAccount.name + "'s balance is: " + myAccount.balance);
            }else if (s.toLowerCase().contains("bye")){
                running = false;
            }
        }
    }
}