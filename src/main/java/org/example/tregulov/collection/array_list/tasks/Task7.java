package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Случайным образом перемешать элементы в ArrayList
 */
public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}
