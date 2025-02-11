package org.example.tregulov.stream;

import java.util.List;
import java.util.Optional;

/**
 * Получение первого элемента из списка чисел
 */
public class Test18 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(56, 6456, 6567, 346, 45, 645, 765, 3454);
        Optional<Integer> firstNumber = numbers.stream().findFirst();
        firstNumber.ifPresentOrElse(
            num -> System.out.println("Первый элемент: " + num),
            () -> System.out.println("Список пуст")
        );
    }
}