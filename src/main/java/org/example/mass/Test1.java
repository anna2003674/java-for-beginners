package org.example.mass;

public class Test1 {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // по умолчанию все элементы массива 0
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(" ");

        int[] numbers2 = {11, 11, 22, 33, 44, 77}; // объявление и инициализация массива
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }


    }
}
