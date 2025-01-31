package org.example.lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArray(arr1);
        fillList(list1);
        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        arr1 = Arrays.stream(arr1).map(x -> x * 2).toArray();
        list1 = list1.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);

        int[] arr2 = arr1;
        arr2 = Arrays.stream(arr2).map(x -> 3).toArray();
        System.out.println(Arrays.toString(arr2));

        arr2 = Arrays.stream(arr2).map(x -> x + 1).toArray();
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArray(arr3);
        fillList(list2);
        arr3 = Arrays.stream(arr3).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(Arrays.toString(arr3));
        System.out.println(list2);

        Arrays.stream(arr3).forEach(a -> System.out.println(a));
        list2.stream().forEach(System.out::println);

        int[] arr4 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        fillList(list3);
        fillArray(arr4);
        int sum1 = Arrays.stream(arr4).reduce((acc, b) -> acc + b).getAsInt();
        int sum2 = list3.stream().reduce((acc, b) -> acc * b).get();
        System.out.println("Сумма элементов arr4: " + sum1);
        System.out.println("Произведение элементов list3: " + sum2);

        int[] arr5 = new int[10];
        fillArray(arr5);
        System.out.println(Arrays.toString(arr5));
        int[] arr6 = Arrays.stream(arr5).filter(x -> x % 2 != 0).map(x -> x * 2).toArray();
        System.out.println(Arrays.toString(arr6));

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(45);
        set.add(7);
        System.out.println(set);
        set = set.stream().map(x -> x * 2).collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArray(int[] arrays) {
        for (int i = 0; i < 10; i++) {
            arrays[i] = i + 1;
        }
    }
}
