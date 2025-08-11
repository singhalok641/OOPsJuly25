package org.example.ExceptionHandling;

public class StackOverflowDemo {
    public static void recurse(int n) {
        recurse(n+1);
    }

    public static void main(String[] args) {
        recurse(1);
    }
}
