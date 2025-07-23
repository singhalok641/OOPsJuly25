package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        // We can create real entities from the com.scaler.oopsJuly.Student class
//        Student prakhar = new Student();
//        prakhar.name = "Prakhar";
//        prakhar.email = "prakhar@gmail.com";
//        prakhar.id = 1;
//        prakhar.course = "Backend LLD";
//        prakhar.displayDetails();
//
//
//        Student shilpa = new Student();
//        shilpa.name = "Shilpa";
//        shilpa.email = "shilpa@gmail.com";
//        shilpa.id = 2;
//        shilpa.course = "Backend LLD Jul";
//        shilpa.displayDetails();

        BankAccount myAccount = new BankAccount();
        myAccount.ownerName = "Jitendra";
        myAccount.balance = 15000;
        myAccount.showBalance();
        myAccount.deposit(-1700);
        myAccount.showBalance();



    }
}

/*
Create a new Java file BankAccount.java and define a simple BankAccount class to
represent a Bank account

Add two fields: balance(double) and ownerName(String)

Add deposit and withdraw method with basic validation
(e.g ensure withdrawals don't result in -ve balances)
 */
