package org.example.lambdasAndStreams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 72, 3, 4, 6, 6, 62, 10, 1, 9, 8, 9, 12);

        Stream<Integer> stream =  list.stream(); // create a stream


        // Apply operations on this stream: filtering, mapping, sorting - Intermediate operations
        // collect output: collect() , forEach() -> Terminal operations

        List<Integer> l1 = stream
                .filter((x) -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(l1);

        List<Integer> l2 = list.stream()
                .filter((x) -> x % 2 == 0)
                .sorted()
                .collect(Collectors.toList());


        System.out.println(l2);

        // map(argument) -> transforms into something else using the logic mentioned
        // filter even data, sort it, for every element, get it's square

        List<Integer> l3 = list.stream()
                .filter((x) -> x % 2 == 0)
                .sorted()
                .map((x) -> x * x)
                .collect(Collectors.toList());


        System.out.println(l3);

        // Advantages:
        // 1. Concise and readable code
        // 2. Lazy Evaluation

        Optional<Integer> optional = list.stream()
                .filter((x) -> {
                    System.out.println("Filtering: " + x);
                    return  x % 2 == 0;
                })
                .map((x) -> {
                    System.out.println("Mapping: " + x);
                    return x * x;
                })
                .distinct()
                .findAny();

        Integer value = null;
        if(optional.isPresent()) {
            value = optional.get();
        }

        System.out.println(value);
    }
}

/*
test(Integer t) {
matches the testing logic
 */
