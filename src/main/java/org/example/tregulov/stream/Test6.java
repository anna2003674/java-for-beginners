package org.example.tregulov.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alex");
        List<String> result1 = names.stream()
            .filter(name -> name.startsWith("A"))
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());
        System.out.println(result1);
    }
}
