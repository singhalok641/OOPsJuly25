package org.example.synchronisation.AdderSubtractorSynchronized;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1; i<=10000; i++) {
            synchronized (count) {
                count.value -= i;
            }
//            System.out.println("Subtractor: " + count.value);
        }
    }
}
