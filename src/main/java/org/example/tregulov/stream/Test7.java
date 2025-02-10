package org.example.tregulov.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);

        List<String> list1 = Arrays.asList("Alice", "Bob");
        List<String> list2 = Arrays.asList("Charlie", "David");
        List<String> result = Stream.concat(list1.stream(), list2.stream())
            .collect(Collectors.toList());
        System.out.println(result);

        List<Integer> numbers1 = Arrays.asList(1, 3, 5);
        List<Integer> numbers2 = Arrays.asList(2, 4, 6);
        List<Integer> sortedNumbers = Stream.concat(numbers1.stream(), numbers2.stream())
            .sorted()
            .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        List<String> group1 = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> group2 = Arrays.asList("Bob", "David", "Alice");
        List<String> uniqueNames = Stream.concat(group1.stream(), group2.stream())
            .distinct()
            .collect(Collectors.toList());
        System.out.println(uniqueNames);

        Stream<String> stream11 = Stream.of("A", "B");
        Stream<String> stream21 = Stream.of("C", "D");
        Stream<String> stream31 = Stream.of("E", "F");
        Stream<String> combinedStream = Stream.of(stream11, stream21, stream31)
            .flatMap(s -> s);
        combinedStream.forEach(System.out::print);
    }
}