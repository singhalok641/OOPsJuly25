package org.example.generics;

public class Client {
    public static void main(String[] args) {
//        Box<Integer> box = new Box<>();
//        box.doSomething(12);

        Integer[] arr = new Integer[]{1,2,3};
        Box.doSomething1(arr, 123);
    }
}
