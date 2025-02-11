package org.example.tregulov.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Разделение студентов по возрасту (младше 21 года и старше)
 */
public class Test17 {
    public static void main(String[] args) {
        List<Student3> students = List.of(
            new Student3("Alice", 20),
            new Student3("Bob", 22),
            new Student3("Charlie", 20),
            new Student3("David", 22),
            new Student3("Eve", 21)
        );
        Map<Boolean, List<Student3>> partitioned = students.stream()
            .collect(Collectors.partitioningBy(student -> student.age < 21));
        System.out.println("Младше 21: " + partitioned.get(true));
        System.out.println("21 и старше: " + partitioned.get(false));
    }
}

class Student3 {
    String name;
    int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}