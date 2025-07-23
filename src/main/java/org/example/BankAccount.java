package com.scaler.oopsJuly;

public class BankAccount {
    double balance;
    String ownerName;

    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }

    void showBalance() {
        System.out.println(ownerName + "'s Balance: $" + balance);
    }
}
