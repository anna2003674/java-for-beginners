package org.example.tregulov.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator, element) -> accumulator * element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("Not present");
        }

        int result3 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result);

        List<String> list5 = new ArrayList<>();
        list5.add("Anna");
        list5.add("Alex");
        list5.add("Dasha");
        list5.add("Masha");
        list5.add("Oleg");
        String result4 = list5.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result4);

        List<String> words = Arrays.asList("Java", "Streams", "Reduction", "API");
        Optional<String> longest = words.stream().reduce((a, b) -> a.length() >= b.length() ? a : b);
        longest.ifPresent(System.out::println);
    }
}