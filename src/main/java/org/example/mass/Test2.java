package org.example.mass;

public class Test2 {
    public static void main(String[] args) {
        int[] num1 = new int[5]; // массив целых чисел
        num1[0] = 10;

        String[] strings = new String[3]; // массив строк
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        // цикл for
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        // цикл for-each
        for (String s1 : strings) {
            System.out.println(s1);
        }

        int[] numbers = {1, 2, 3, 10, 4};
        int sum = 0;
        for (int x : numbers) {
            sum += x; // сумма всех чисел массива
        }
        System.out.println(sum);
    }
}
