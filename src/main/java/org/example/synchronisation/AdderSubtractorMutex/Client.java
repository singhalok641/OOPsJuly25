package org.example.synchronisation.AdderSubtractorMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        System.out.println(count.value);
        /*
        1. Add nums from 1 to 100 to count.value
        2. Subtract nums from 1 to 100 from count.value

        Thread 1: +1, +2, +3, +4 ...... + 100
        Thread 2: -1, -2, -3, -4 ....... -100

        final value: 0
         */

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        System.out.println("DEBUG");
        t1.join();
        t2.join();

        System.out.println(count.value);

    }
}

/*

Adder Thread: +1, +2, +3, +4, +5
Subtractor Thread: .............., -1, -2, -3


Properties of a lock:
1. Only one thread can lock the lock at one time
2.
 */
