package org.example.tregulov.stream;

import java.util.List;

/**
 * Преобразование списка строк в их длины
 */
public class Test26 {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Stream", "API", "mapToInt");
        words.stream()
            .mapToInt(String::length)
            .forEach(System.out::println);
    }
}