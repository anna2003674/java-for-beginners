package org.example.tregulov.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        int[] arrays = {5, 9, 3, 8, 1};
        Arrays.stream(arrays).forEach(element -> {
            element *= 2;
            System.out.println(element);
        });
        System.out.println();
        Arrays.stream(arrays).forEach(element -> System.out.println(element));
        System.out.println();
        Arrays.stream(arrays).forEach(System.out::println);
        System.out.println();
        Arrays.stream(arrays).forEach(Utils::myMethod);

        Stream<String> myStream = Stream.of("Anna", "Dasha", "Masha", "Misha", "Andrey");
        List<String> list = myStream.filter(element -> element.length() > 5).collect(Collectors.toList());
        System.out.println(list);
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element: " + a);
    }
}