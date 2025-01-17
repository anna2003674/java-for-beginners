package org.example.oop;

/**
 * 1) При создании объекта сразу вызывается конструктор.
 * 2) Конструктор используется для инициализации нового объекта.
 * 3) Конструкторы можно перегружать.
 * 4) Имя конструктора совпадает с именем класса.
 * 5) Конструкторы не имеют типа возвращаемого значения, даже void
 * 6) Если конструктор не задан вручную, компилятор Java предоставляет конструктор по умолчанию,
 * который не принимает параметров и инициализирует поля значениями по умолчанию.
 */

public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Anna", 23);
        Human human2 = new Human("Bob");
        Human human3 = new Human(30);
        Human human4 = new Human(36, "Masha");
    }
}

class Human {
    private String name;
    private int age;

    // первый конструктор
    public Human() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    // второй конструктор
    public Human(String name) {
        System.out.println("Привет из второго конструктора!");
        this.name = name;
    }

    // третий конструктор
    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
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
