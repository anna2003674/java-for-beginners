package org.example.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList();
        for (int i = 0; i < 100; i++) {
            arraylist.add(i);
        }
        System.out.println(arraylist);
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(99));

        System.out.println(arraylist.size());

        for (int j = 0; j < arraylist.size(); j++) {
            System.out.println(arraylist.get(j));
        }

        for (Integer x : arraylist) {
            System.out.println(x);
        }

        arraylist.remove(5);
        System.out.println(arraylist);

        // Мы проводим много удалений из arraylist
        arraylist = new LinkedList<Integer>(); // Теперь можем эффективно удалять элементы из arraylist
    }
}
