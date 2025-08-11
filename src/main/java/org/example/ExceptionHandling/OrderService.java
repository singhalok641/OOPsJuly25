package org.example.ExceptionHandling;

public class OrderService {
    public void ship(String orderId) throws InvalidOrderStateException {
        String state = findState(orderId);


        if(!"PAID".equals(state)) {
            throw new InvalidOrderStateException(
                    "Order Not shippable in state: " + state, orderId, state
            );
        }
    }

    private String findState(String orderId) {
        return "CREATED";
    }
}
