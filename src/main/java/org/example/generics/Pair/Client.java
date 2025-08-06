package org.example.generics.Pair;

import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
//        Pair p = new Pair("Hello", 100);
//        p.setFirst(55); // Allowed! But we really wanted string in first pos
//
//        String s = (String)p.getFirst(); // ClassCastException at runtime!

        // Pair generic

        PairGeneric<String, Integer> p = new PairGeneric<>("Alok", 95);
        // p.setFirst(22); // this is compile time error
        p.setFirst("Ankur");

        // What if I do not specify the type?
        PairGeneric p1 = new PairGeneric("Bob", 85); // Raw types
        p1.setFirst(22);

//        Set<Integer> set = new HashSet<>();



        // This disables checks and is not recommended because it looses type safety
    }
}

/*
There is no compile-time type safety

Generics are giving us flexibility and compile time type safety.

Why are Raw types still supported? - Backward compatibility



 */
