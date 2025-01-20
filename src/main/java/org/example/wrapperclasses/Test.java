package org.example.wrapperclasses;

/**
 * Классы-обертки (wrapper classes) в Java предоставляют объектное представление примитивных типов данных.
 * Они позволяют работать с примитивами как с объектами, что полезно, например, при использовании коллекций
 * (List, Set, Map),
 * которые не поддерживают примитивные типы.
 */
public class Test {
    public static void main(String[] args) {
        // Классы-обертки примитивных типов данных:
        // Double, Float, Long, Integer, Short, Byte, Character, Boolean

        int x1 = 12;
        Integer x2 = new Integer(523);
        Integer x3 = Integer.valueOf(10);
        Integer fromString = Integer.valueOf("123"); // преобразование строки в число
        Integer.parseInt("123");

        Integer a1 = 123;
        Integer a2 = new Integer(123);
        int z1 = a2;

        Boolean b = Boolean.FALSE;

        int m1 = 120;
        Integer obj = m1; // Автоупаковка (Autoboxing)

        Integer obj2 = 20;
        int num2 = obj2; // Автораспаковка (Unboxing)

        String str = "42";
        int num = Integer.parseInt(str); // Преобразование строки в int

        String numStr = Integer.toString(num); // Преобразование int в строку

        Integer object = Integer.valueOf(num); // Преобразование int в объект Integer

        // Получение минимального и максимального значений int
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
