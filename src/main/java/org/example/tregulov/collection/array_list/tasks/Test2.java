package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;

/**
 * Создайте ArrayList<Integer>. Добавьте в него числа от 1 до 10.
 * Удалите все четные числа. Выведите итоговый список.
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.removeIf(n -> n % 2 == 0);
        System.out.println(list);
    }
}
