package org.example.tregulov.stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Test28 {
    public static void main(String[] args) {
        List<Integer> ages = List.of(18, 22, 25, 20, 24);
        OptionalDouble averageAge = ages.stream()
            .mapToInt(age -> age)
            .average();
        System.out.println("Средний возраст: " + averageAge.orElse(0));

        List<Integer> numbers = List.of(5, 12, 3, 19, 7);
        OptionalInt min = numbers.stream().mapToInt(n -> n).min();
        OptionalInt max = numbers.stream().mapToInt(n -> n).max();
        System.out.println("Минимум: " + min.orElse(-1));
        System.out.println("Максимум: " + max.orElse(-1));
    }
}