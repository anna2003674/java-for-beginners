package org.example.tregulov.stream;

/**
 * Поиск строки с минимальной и максимальной длиной
 */

import java.util.List;
import java.util.Optional;

public class Test23 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "kiwi", "strawberry", "grape");

        Optional<String> shortest = words.stream()
            .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        Optional<String> longest = words.stream()
            .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        shortest.ifPresent(s -> System.out.println("Самое короткое слово: " + s));
        longest.ifPresent(s -> System.out.println("Самое длинное слово: " + s));
    }
}