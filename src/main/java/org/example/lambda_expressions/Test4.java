package org.example.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArray(arrays);
        fillList(list);
        System.out.println(list);
        System.out.println(Arrays.toString(arrays));

        for (int i = 0; i < 10; i++) {
            arrays[i] = arrays[i] * 2;
            list.set(i, list.get(i) * 2);
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println(list);

        arrays = Arrays.stream(arrays).map(x -> x * 2).toArray();
        list = list.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(Arrays.toString(arrays));
        System.out.println(list);
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
