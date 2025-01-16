package org.example.cycles;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // while (выполняется до тех пор пока условие true(истинно))
        int value = 0;
        while (value < 5) {
            System.out.println("Hello " + value);
            value++;
        }

        // цикл for ( Используется, когда известно количество итераций.
        // Состоит из трех частей: инициализация, условие и инкремент (или декремент).)
        for (int i = 0; i <= 10; i++) { // i++ == i = i + 1
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i += 5) {
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i -= 5) {
            System.out.println(i);
        }

        int h = 15;
        if (h < 10) {
            System.out.println("Число " + h + " меньше 10");
        } else if (h > 20) {
            System.out.println("Число " + h + " больше 20");
        } else {
            System.out.println("Привет!");
        }

        // цикл do..while (сначало выполняет действие, а потом проверяет условие;
        // тело цикла выполнится хотя бы один раз, даже если условие сразу ложное.)
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Введи 5: ");
            num = scanner.nextInt();
        } while (num != 5);
        System.out.println("Вы ввели 5!");

        // цикл for-each (Цикл for-each используется для перебора элементов коллекций или массивов.
        // Он позволяет пройти по всем элементам без явного указания индекса)
        int[] arr = {1, 2, 3, 4, 5};
        for (int number : arr) {
            System.out.println(number);
        }
    }
}
