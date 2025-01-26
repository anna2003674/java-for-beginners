package org.example.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap - это структура данных, которая представляет собой коллекцию, основанную на принципах хэширования.
 * Она используется для хранения пар "ключ-значение" и обеспечивает быстрый доступ к элементам по ключу.
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Тройка");
        System.out.println(map);
        map.put(3, "Другое значение"); // старое значение меняется на новое
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(10)); // null

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
