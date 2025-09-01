package org.example.designPatterns.adapter;

public class ICICIBankAdapter implements BankAPI{
    @Override
    public void addBankAccount(Bank bank) {

    }

    @Override
    public boolean pay(double amount, String account) {
        return false;
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void transferFunds(String srcAccount, String destAccount, double amount) {

    }
}
