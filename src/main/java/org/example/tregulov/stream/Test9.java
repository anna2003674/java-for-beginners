package org.example.tregulov.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test9 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.distinct().count());

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        long count = names.stream().count();
        System.out.println("Количество элементов: " + count);

        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 60);
        long count1 = numbers.stream()
            .filter(n -> n > 30)
            .count();
        System.out.println("Чисел больше 30: " + count1);
    }
}