package org.example.tregulov.generics.parameterized_method;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(5);
        int a = GenMethod.getSecondElement(list1);
        System.out.println(a);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Anna");
        list2.add("Dasha");
        list2.add("Masha");
        String str = GenMethod.getSecondElement(list2);
        System.out.println(str);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}
