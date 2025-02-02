package org.example.tregulov.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee employee3 = new Employee(123, "Ivan", "Sidorov", 8542);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", salary=" + salary +
            '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

