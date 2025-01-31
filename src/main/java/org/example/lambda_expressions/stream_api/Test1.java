package org.example.lambda_expressions.stream_api;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream1 = list.stream();

        Stream<Integer> stream2 = Stream.of(12, 12, 34, 67656);

        int[] arr = {1, 4, 465, 35, 657};
        IntStream stream3 = Arrays.stream(arr);

        Stream<Integer> stream4 = Stream.iterate(0, n -> n + 2).limit(10);
        Stream<Double> stream5 = Stream.generate(Math::random).limit(5);

        List mapped = list.stream().map(n -> "Число " + n).collect(Collectors.toList());
        System.out.println(mapped);

        Stream<Integer> filtered = list.stream().filter(m -> m % 2 != 0);

        Stream<Integer> distincted = list.stream().distinct();

        Stream<Integer> limited = list.stream().limit(3);  // Первые 3 элемента
        Stream<Integer> skipped = list.stream().skip(2);   // Пропускает первые 2 элемента

        Stream<Integer> sorted = list.stream().sorted(); // По умолчанию (Natural Order)
        Stream<Integer> sortedDesc = list.stream().sorted(Comparator.reverseOrder()); // Обратный порядок

        list.stream().forEach(System.out::println);

        long count = list.stream().count();

        Optional<Integer> first = list.stream().findFirst();
        Optional<Integer> any = list.stream().findAny();

        Optional<Integer> min = list.stream().min(Integer::compareTo);
        Optional<Integer> max = list.stream().max(Integer::compareTo);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
        IntSummaryStatistics stats = list.stream().mapToInt(Integer::intValue).summaryStatistics();

        Integer[] array = list.stream().toArray(Integer[]::new);

        Stream<Integer> parallelStream = list.parallelStream();
        int sumParallel = list.parallelStream().mapToInt(Integer::intValue).sum();

        Set<String> set = Set.of("A", "B", "C", "D");
        List<String> upperCaseList = set.stream().map(String::toUpperCase).collect(Collectors.toList());

        Map<Integer, String> map = Map.of(1, "One", 2, "Two", 3, "Three");
        List<String> values = map.values().stream().collect(Collectors.toList());
        List<Integer> keys = map.keySet().stream().collect(Collectors.toList());

    }
}
