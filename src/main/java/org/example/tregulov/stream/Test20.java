package org.example.tregulov.stream;

import java.util.List;
import java.util.Optional;

/**
 * Поиск первого студента старше 18 лет
 */
public class Test20 {
    public static void main(String[] args) {
        List<Student5> students = List.of(
            new Student5("Alice", 17),
            new Student5("Bob", 19),
            new Student5("Charlie", 20)
        );

        Optional<Student5> firstAdult = students.stream()
            .filter(s -> s.age >= 18)
            .findFirst();

        firstAdult.ifPresentOrElse(
            student -> System.out.println("Первый взрослый студент: " + student.name),
            () -> System.out.println("Взрослых студентов нет")
        );
    }
}

class Student5 {
    String name;
    int age;

    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }
}