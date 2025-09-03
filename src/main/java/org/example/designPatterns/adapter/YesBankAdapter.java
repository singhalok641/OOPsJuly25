package org.example.designPatterns.adapter;

public class YesBankAdapter implements BankAPI{
    private YesBank yesBank;

    public YesBankAdapter(YesBank yesBank) {
        this.yesBank = yesBank;
    }

    @Override
    public void addBankAccount(Bank bank) {

    }

    @Override
    public boolean pay(double amount, String account) {
        return false;
//        yesBank.transferMoney(amount, Long.valueOf(account));
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void transferFunds(FundDetails fundDetails) {

    }
}
