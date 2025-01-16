package org.example.scannerclass;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = sc.nextLine();
        System.out.println("Вы ввели: " + str);

        System.out.print("Введите число: ");
        int num = sc.nextInt();
        System.out.println("Вы ввели: " + num);
    }
}
