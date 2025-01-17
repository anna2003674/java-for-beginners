package org.example.oop;

/**
 * Ключевое слово static
 * Статические методы служат для того, чтобы иметь доступ к статическим полям,
 * которые общие для всех объектов этого класса.
 */
public class WordStatic {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 40);
        Person person2 = new Person("Tom", 30);
        person1.printNumberOfPeople();
        person2.printNumberOfPeople();
        Person.description = "Nice"; // обращение к полю по имени класса (эта static поле будет общим для всех объектов класса Person)
        // Person.getDescription();
        person1.getAllField();
        person2.getAllField();
        Person.description = "Bad";
        person1.getAllField();
        person2.getAllField();
        // если изменить поле description у одного объекта, то изменения будет у всех объектов (т.к. поле description общее для всех объектов))
        // мы не можем обращаться из статического метода к нестатическому полю объекта
        // статический метод может работать только со статическими переменными
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.PI);
    }
}

class Person {
    private String name; // поле объекта
    private int age; // поле объекта
    public static String description; // поле принадлежит самому классу
    private static int countPeople; // переменная одна для всех объектов

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void getAllField() {
        System.out.println(name + age + description);
    }

    public void printNumberOfPeople() {
        System.out.println("Number of peoples is " + countPeople);
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
