package org.example.ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OOMDemo {
    public static void main(String[] args) {
        List<byte[]> heap = new ArrayList<>();
        while (true) {
            heap.add(new byte[10_000_000]); // 10 MB chunks
        }
    }
}
