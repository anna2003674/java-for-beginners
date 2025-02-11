package org.example.tregulov.stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test25 {
    public static void main(String[] args) {
        // Пропуск первых 3 чисел
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
            .skip(3)
            .forEach(System.out::println);

        // Пропуск элементов в бесконечном потоке
        Stream.generate(() -> new Random().nextInt(100))
            .skip(3)
            .limit(5)
            .forEach(System.out::println);
    }
}