package org.example.switchoperstor;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // оператор switch
        /**
         * похож на оператор if, но используется в том случае,
         * если есть много условий, которые нужно перебрать
         * (вместо того, чтобы писать много if, удобнее написать switch)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст: ");
        int age = scanner.nextInt();
        if (age == 5) {
            System.out.println("Ты в садике");
        } else if (age == 11) {
            System.out.println("Ты учишься в школе");
        } else if (age == 18) {
            System.out.println("Ты закончил школу");
        } else if (age == 20) {
            System.out.println("Ты учишься в университете");
        } else if (age >= 50 && age < 70) { // от 50 до 70 (не включительно)
            System.out.println("Ты работаешь");
        } else if (age == 70) {
            System.out.println("Ты на пенсии");
        }

        // лучше писать оператор switch, чем писать много if else-if
        // если break не ставить, то будут выполняться кейсы, которые расположены ниже
        switch (age) {
            case 1:
                System.out.println("Ты родился");
                break;
            case 5:
                System.out.println("Ты в садике");
                break;
            case 11:
                System.out.println("Ты в школе");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            case 20:
                System.out.println("Ты в университете");
                break;
            case 38:
                System.out.println("Ты работаешь");
                break;
            case 70:
                System.out.println("Ты на пенсии");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло! ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи цвет: ");
        String color = sc.nextLine();
        switch (color) {
            case "red":
                System.out.println("Красный цвет");
                break;
            case "green":
                System.out.println("Зеленый цвет");
                break;
            case "black":
                System.out.println("Черный цвет");
                break;
            default:
                System.out.println("Такого цвета нет!");
        }


    }
}
