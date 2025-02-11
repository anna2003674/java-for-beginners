package org.example.tregulov.stream;

import java.util.List;

/**
 * Сумма всех возрастов студентов
 */
public class Test27 {
    public static void main(String[] args) {
        List<Student7> students = List.of(
            new Student7("Alice", 20),
            new Student7("Bob", 22),
            new Student7("Charlie", 21)
        );

        int totalAge = students.stream()
            .mapToInt(student -> student.age)
            .sum();

        System.out.println("Сумма возрастов: " + totalAge);
    }
}

class Student7 {
    String name;
    int age;

    Student7(String name, int age) {
        this.name = name;
        this.age = age;
    }
}