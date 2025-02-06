package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Проверить, содержит ли список заданное число
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number;

        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: введите целое число!");
            scanner.close();
            return;
        }

        scanner.close(); // Закрываем Scanner после ввода

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        boolean result = containsNumber(numbers, number);
        System.out.println("Число " + number + (result ? " найдено в списке." : " отсутствует в списке."));
    }

    private static boolean containsNumber(ArrayList<Integer> list, int number) {
        for (int num : list) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
