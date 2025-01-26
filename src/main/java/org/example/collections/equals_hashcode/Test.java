package org.example.collections.equals_hashcode;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Anna");
        Person person2 = new Person(1, "Anna");

        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        map.put(person1, "123");
        map.put(person2, "123");

        set.add(person1);
        set.add(person2);
        System.out.println(map);
        System.out.println(set);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }

    // всегда выдет правильный ответ (равны ли объекты), но очень долгий
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    // вызывается первым для проверки объектов на равенство
    // {Object} -> {int} конвертируем объект в целое число
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    // Коллизия возникает, когда хеш-коды одинаковые у объектов, но сами объекты разные

    /**
     * Контракт hashCode() and equals()
     * 1) У двух проверяемых объектов вызываем метод hashCode()
     * если хеши разные, то объекты точно разные (выдает пользователю ответ, что объекты разные)
     * 2) если хеши одинаковые, то:
     * вызываем метод equals(), который медленный, но точно даст ответ, одинаковые ли объекты или нет
     */
}
