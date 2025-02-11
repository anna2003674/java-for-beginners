package org.example.tregulov.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Группировка студентов по возрасту
 */
public class Test14 {
    public static void main(String[] args) {
        List<Student1> students = List.of(
            new Student1("Alice", 20),
            new Student1("Bob", 22),
            new Student1("Charlie", 20),
            new Student1("David", 22),
            new Student1("Eve", 21)
        );
        Map<Integer, List<Student1>> groupedByAge = students.stream()
            .collect(Collectors.groupingBy(student -> student.age));
        System.out.println(groupedByAge);
    }
}

class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
