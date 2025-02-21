package org.example.tregulov.scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            try {
                System.out.print("Введите первое число: ");
                double num1 = scanner.nextDouble();

                System.out.print("Введите операцию (+, -, *, /) или 'exit' для выхода: ");
                String operator = scanner.next();

                if (operator.equalsIgnoreCase("exit")) {
                    System.out.println("Выход из калькулятора.");
                    break;
                }

                System.out.print("Введите второе число: ");
                double num2 = scanner.nextDouble();

                double result = 0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Ошибка: деление на ноль!");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Неверная операция! Попробуйте снова.");
                        continue;
                }
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите корректные данные.");
                scanner.nextLine();
            }
            System.out.print("Хотите продолжить? (да/нет): ");
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("нет")) {
                continueCalculation = false;
                System.out.println("Выход из калькулятора.");
            }
        }
        scanner.close();
    }
}
