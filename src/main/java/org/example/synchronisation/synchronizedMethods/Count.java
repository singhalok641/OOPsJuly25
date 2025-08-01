package org.example.synchronisation.synchronizedMethods;

public class Count {
    private int value = 0;

    public synchronized void incrementValue(int offset) {
        this.value += offset;
    }

    public int getValue() {
        return this.value;
    }
}
