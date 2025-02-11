package org.example.tregulov.stream;

import java.util.List;
import java.util.Optional;

public class Test21 {
    public static void main(String[] args) {
        List<Integer> list = List.of(34, 576, 36, 68678, 23535);

        Optional<Integer> min = list.stream().min(Integer::compareTo);
        Optional<Integer> max = list.stream().max(Integer::compareTo);

        min.ifPresent(value -> System.out.println("Минимум: " + value));
        max.ifPresent(value -> System.out.println("Максимум: " + value));
    }
}