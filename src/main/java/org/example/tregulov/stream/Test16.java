package org.example.tregulov.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Разделение чисел на четные и нечетные
 */
public class Test16 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Четные: " + partitioned.get(true));
        System.out.println("Нечетные: " + partitioned.get(false));
    }
}