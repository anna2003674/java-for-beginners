package org.example.tregulov.collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test2<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public Test2(int capacity) {
        super(capacity, 0.75f, true); // Включаем access-order (по последнему использованию)
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        Test2<Integer, String> cache = new Test2<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.get(1);  // Доступ к 1 -> теперь 1 становится "новее"
        cache.put(4, "D"); // Удаляет 2 (так как 1 был недавно использован)

        System.out.println(cache); // {3=C, 1=A, 4=D}
    }
}
