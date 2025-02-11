package org.example.tregulov.stream;

import java.util.List;
import java.util.Optional;

/**
 * Поиск первого четного числа
 */
public class Test19 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 6, 7, 8);
        Optional<Integer> firstEven = numbers.stream()
            .filter(n -> n % 2 == 0)
            .findFirst();
        firstEven.ifPresentOrElse(
            num -> System.out.println("Первое четное число: " + num),
            () -> System.out.println("Четных чисел нет")
        );
    }
}