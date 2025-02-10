package org.example.tregulov.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 7, 465, 78678, 2342, 76, 3, 6, 67, 6, 4, 64, 6, 77, 354};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        List<String> words = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        words.stream()
            .sorted()
            .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        numbers.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
    }
}