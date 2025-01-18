package org.example.Lesson24;

import java.util.Date;

/**
 * Форматирование строк
 */
public class Test {
    public static void main(String[] args) {
        System.out.printf("This is a string, %s", "NICE");
        System.out.println();
        System.out.printf("This is a string, %d", 10);
        System.out.println();
        System.out.printf("%f This is %s a string, %d", 10.4, "NICE", 1000);
        System.out.println();
        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1000000000);
        System.out.println();
        System.out.printf("String %.2f \n", 45.34533);
        System.out.printf("String %.2f \n", 45.3453323232);
        System.out.printf("String %.2f \n", 45.345);
        System.out.printf("String %.2f \n", 45.34);

        String name = "Anna";
        int age = 21;
        float weight = 56.6f;
        float height = 170.53f;
        System.out.printf("Имя %s, возраст %d, вес %.1f, рост %.2f", name, age, weight, height);

        Date now = new Date();
        System.out.printf("\nТекущая дата: %1$tY-%1$tm-%1$td%n", now);
    }
}
