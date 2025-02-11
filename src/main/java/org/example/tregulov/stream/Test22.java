package org.example.tregulov.stream;

import java.util.List;
import java.util.Optional;

/**
 * Поиск самого молодого и самого старшего студента
 */
public class Test22 {
    public static void main(String[] args) {
        List<Student6> students = List.of(
            new Student6("Alice", 22),
            new Student6("Bob", 20),
            new Student6("Charlie", 24),
            new Student6("David", 19)
        );
        Optional<Student6> youngest = students.stream()
            .min((s1, s2) -> Integer.compare(s1.age, s2.age));
        Optional<Student6> oldest = students.stream()
            .max((s1, s2) -> Integer.compare(s1.age, s2.age));
        youngest.ifPresent(student -> System.out.println("Самый молодой: " + student));
        oldest.ifPresent(student -> System.out.println("Самый старший: " + student));
    }
}

class Student6 {
    String name;
    int age;

    Student6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}