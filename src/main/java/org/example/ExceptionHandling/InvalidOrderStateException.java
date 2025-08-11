package org.example.ExceptionHandling;

public class InvalidOrderStateException extends Exception{
    private final String orderId;
    private final String currentState;

    public InvalidOrderStateException(String message) {
        super(message);
        this.orderId = null;
        this.currentState = null;
    }

    public InvalidOrderStateException(String message, Throwable cause) {
        super(message, cause);
        this.orderId = null;
        this.currentState = null;
    }

    public InvalidOrderStateException(String message, String orderId, String currentState) {
        super(message);
        this.orderId = orderId;
        this.currentState = currentState;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCurrentState() {
        return currentState;
    }
}
