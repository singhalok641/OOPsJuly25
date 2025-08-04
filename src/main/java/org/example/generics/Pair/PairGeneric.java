package org.example.generics.Pair;

public class PairGeneric<T, V> {
    private T first;
    private V second;

    public PairGeneric(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
