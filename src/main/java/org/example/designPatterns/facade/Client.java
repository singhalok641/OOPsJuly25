package org.example.designPatterns.facade;

public class Client {
    public static void main(String[] args) {
        CheckoutFacade facade = new CheckoutFacade();
        String label = facade.checkout("alok", "secret", "SKU-1", 2, "4111-1111-2222-3333",
                99.9, "Grote Belt 49");

        if(label == null) throw new RuntimeException("Checkout failed");
        System.out.println("Order places, label = " + label);
    }
}
