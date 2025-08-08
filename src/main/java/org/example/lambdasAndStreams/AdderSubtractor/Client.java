package org.example.lambdasAndStreams.AdderSubtractor;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

//        Adder adder = new Adder(count);
//        Subtractor subtractor = new Subtractor(count);

        // Lambda
        /*
        1. Create an anonymous class => adderLambdaAnonymous
        2. It will make this adderLambdaAnonymous class implement the Runnable interface
        3. It will pass all thw variables being shared
        4. It will copy the code from the lambda body to the method of the adderLambdaAnonymous class that we implement

         */

//        Runnable adderLambda = () -> {
//            for(int i=1; i<=10000; i++) {
//                synchronized (count) {
//                    count.value += i;
//                }
//            }
//        };
//
//        Runnable subtractorLambda = () -> {
//            for(int i=1; i<=10000; i++) {
//                synchronized (count) {
//                    count.value -= i;
//                }
//            }
//        };


        Thread t1 = new Thread(() -> {
            for(int i=1; i<=10000; i++) {
                synchronized (count) {
                    count.value += i;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1; i<=10000; i++) {
                synchronized (count) {
                    count.value -= i;
                }
            }
        });

        t1.start();
        t2.start();

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
