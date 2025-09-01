package org.example.designPatterns.adapter;

public class Bank {
    private String accountNumber;
    private String accountHolderNumber;

    public Bank(String accountNumber, String accountHolderNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderNumber = accountHolderNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderNumber() {
        return accountHolderNumber;
    }

    public void setAccountHolderNumber(String accountHolderNumber) {
        this.accountHolderNumber = accountHolderNumber;
    }
}
