package org.example.tregulov.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test10 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.distinct().peek(System.out::println).count());

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
            .peek(name -> System.out.println("До обработки: " + name))
            .map(String::toUpperCase)
            .peek(name -> System.out.println("После обработки: " + name))
            .collect(Collectors.toList());
    }
}