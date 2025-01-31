package org.example.lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AnnaTerem", "Alex", "Dasha", "Masha");
        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(names);
    }
}
