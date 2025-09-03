package org.example.designPatterns.facade;

public class CheckoutFacade {
    private final AuthService auth = new AuthService();
    private final InventoryService inv = new InventoryService();
    private final PaymentService pay = new PaymentService();
    private final ShippingService ship = new ShippingService();

    public String checkout(String user, String pass, String sku, int qty, String card, double amount, String address) {
        if(!auth.login(user, pass)) return null;
        if(!inv.reserve(sku, qty)) return null;
        if(!pay.charge(card, amount)) return null;
        return ship.createLabel(address);


    }
}
