package org.example.designPatterns.adapter;

public class PhonePe {
    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    void performBankOperation() {
        Bank bank = new Bank("122423423442",
                "Alok Singh");

        bankAPI.addBankAccount(bank);
        boolean paymentStatus = bankAPI.pay(100.0, "11234134131");

        if(paymentStatus) {
            bankAPI.transferFunds("1224424234", "12342342342342", 50.0);
        }
    }
}
