package org.example.designPatterns.adapter;

public interface BankAPI {
    void addBankAccount(Bank bank);
    boolean pay(double amount, String account);
    double checkBalance();
    void transferFunds(FundDetails fundDetails);
}
