package org.example.tregulov.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test13 {
    public static void main(String[] args) {
        List<int[]> listOfArrays = Arrays.asList(
            new int[]{1, 2, 3},
            new int[]{4, 5},
            new int[]{6, 7, 8, 9}
        );
        List<Integer> numbers = listOfArrays.stream()
            .flatMap(arr -> Arrays.stream(arr).boxed())
            .collect(Collectors.toList());
        System.out.println(numbers);
    }
}