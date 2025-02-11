package org.example.tregulov.stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Вывод первых 3 чисел из списка
 * и
 * Получение первых 5 случайных чисел
 */
public class Test24 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
            .limit(3)
            .forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt(100))
            .limit(5)
            .forEach(System.out::println);
    }
}