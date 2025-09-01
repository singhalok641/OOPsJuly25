package org.example.designPatterns.adapter;

public class Client {
    public static void main(String[] args) {
        BankAPI bankAPI = new ICICIBankAdapter();
        PhonePe phonePe = new PhonePe(bankAPI);

        phonePe.performBankOperation();
    }
}
