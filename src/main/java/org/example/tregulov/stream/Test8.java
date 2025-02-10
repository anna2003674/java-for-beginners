package org.example.tregulov.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test8 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.distinct().forEach(System.out::println);

        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob");
        List<String> uniqueNames = names.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(uniqueNames);
    }
}