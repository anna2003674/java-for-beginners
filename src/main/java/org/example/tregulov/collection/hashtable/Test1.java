package org.example.tregulov.collection.hashtable;

import java.util.Hashtable;

public class Test1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable();
        hashTable.put(21, "Anna");
        hashTable.put(20, "Dasha");
        hashTable.put(26, "Masha");
        hashTable.put(18, "Alex");
        System.out.println(hashTable);

        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");
        System.out.println(table);
        table.forEach((k, v) -> System.out.println(k + " -> " + v));

        for (var entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}