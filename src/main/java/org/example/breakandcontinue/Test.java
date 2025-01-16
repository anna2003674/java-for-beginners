package org.example.breakandcontinue;

public class Test {
    public static void main(String[] args) {
        // оператор break используется для выхода из цикла
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла!");

        System.out.println("---");

        // Оператор continue используется для пропуска текущей итерации цикла и перехода к следующей итерации.
        // Он часто используется, когда нужно пропустить выполнение определенной части кода цикла, если выполнено некоторое условие.
        for (int m = 0; m <= 15; m++) {
            if (m % 2 == 0) {
                continue;
            }
            System.out.println("Это нечетное число: " + m);
        }
    }
}
