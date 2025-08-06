package org.example.generics;

public class Box<T, V> {
    public void doSomething(T item) {
        //
    }

    public static <T,V> void doSomething1(T[] array, V v) {
        for (T item: array) {
            System.out.println(item);
            System.out.println(v);
        }
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

//    public static <T ext> T max(T[] arr) {
//        T max = arr[0];
//        for (T ele: arr) {
//            if(ele)
//        }
//    }
}
