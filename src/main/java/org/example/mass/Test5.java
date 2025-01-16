package org.example.mass;

public class Test5 {
    public static void main(String[] args) {
        // Задача 1: Нахождение масимального и минимального элементов в массиве
        int[] num = new int[]{45, 78, 23, 100, 45, 1};
        int maxElement = num[0];
        int minElement = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxElement) {
                maxElement = num[i];
            }
            if (num[i] < minElement) {
                minElement = num[i];
            }
        }
        System.out.println("Масимальный элемент: " + maxElement);
        System.out.println("Минимальный элемент: " + minElement);

        // Задача 2: Подсчет суммы и среднего арифметического элементов массива
        int[] num2 = new int[]{10, 50, 80, 30};
        int sum = 0;
        int len = num2.length;

        for (int x : num2) {
            sum += x;
        }

        if (len > 0) { // Проверяем, что массив не пуст
            double average = (double) sum / len; // Используем double для точности
            System.out.println("Сумма массива: " + sum);
            System.out.println("Среднее арифметическое массива: " + average);
        } else {
            System.out.println("Массив пуст.");
        }


    }
}
