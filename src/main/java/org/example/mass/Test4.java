package org.example.mass;

public class Test4 {
    public static void main(String[] args) {
        // 1) Объявление массива
        int[] num1;
        int num2[];

        // 2) Создание массива с указанием размера
        int[] num3 = new int[5]; // массив из 5 целочисленных элементов
        String[] str1 = new String[4]; // массив из 4х строковых значений
        boolean[] flags1 = new boolean[4]; // Массив из 4 булевых значений

        // 3) Объявление и инициализация
        int[] mass = {1, 2, 3, 4, 8, 34, 77}; // Массив целых чисел
        String[] s1 = {"Anna", "Dasha", "Masha"}; // Массив строк
        boolean[] flags2 = {true, false, false, true}; // Массив булевых значений

        // 4) Создание с помощью new и инициализация
        int[] numb4 = new int[]{1, 6, 9, 3, 78, 34}; // Указывать размер массива не требуется, если используется явная инициализация значений.

        /**
         * При создании массива нельзя одновременно указывать его размер и инициализировать значения
         */
    }
}
