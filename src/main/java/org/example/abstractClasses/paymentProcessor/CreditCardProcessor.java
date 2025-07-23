package org.example.abstractClasses.paymentProcessor;

public class CreditCardProcessor extends AbstractPaymentProcessor{
    @Override
    public boolean processPayment() {
        // Logic to charge a credit card
        System.out.println("processing CC payments");
        return true;
    }
}
