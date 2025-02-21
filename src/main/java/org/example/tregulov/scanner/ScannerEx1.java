package org.example.tregulov.scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = scanner1.nextInt();
        System.out.println("Введенное число: " + i);

        System.out.println("Напишите два числа:");
        int x = scanner1.nextInt();
        int y = scanner1.nextInt();
        System.out.println("Частное " + x / y);
        System.out.println("Остаток " + x % y);

        System.out.print("Напишите пару слов: ");
        String s = scanner1.nextLine();
        System.out.println("Вы написали: " + s);

        System.out.print("Напишите предложение: ");
        String s1 = scanner1.next();
        System.out.println("Вы написали: " + s1);

        Scanner scanner2 = new Scanner("Привет, мой друг!");
        String s0 = scanner2.next();
        System.out.println(s0);

        Scanner scanner3 = new Scanner("Привет, мой друг!\nКак твои дела?");
        System.out.println(scanner3.next().charAt(2));
        String s3 = scanner3.nextLine();
        System.out.println(s3);
        System.out.println(scanner3.nextLine());
        scanner2.close();
        scanner3.close();
        scanner1.close();
    }
}
