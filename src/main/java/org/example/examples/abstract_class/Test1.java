package org.example.examples.abstract_class;

// Класс Animal – это шаблон для всех животных, но мы не можем создать объект Animal
// Кошка обязана переопределить makeSound(), но может использовать eat() и sleep() из Animal.
abstract class Animal {
    String name;

    abstract void makeSound(); // Абстрактный метод (без реализации)

    void sleep() { // Обычный метод (с реализацией)
        System.out.println("Животное спит");
    }

    void eat() { // Обычный метод
        System.out.println("Животное ест...");
    }

    Animal(String name) { // Конструктор абстрактного класса
        this.name = name;
        System.out.println(name + " создан!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name); // Вызов конструктора родителя
    }

    @Override
    void makeSound() {
        System.out.println(name + " говорит " + "Мяу-мяу!");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Animal dog = new Animal("Шарик") {
            @Override
            void makeSound() {
                System.out.println("Можем создать анонимный класс на основе абстрактного класса!");
            }
        };
        dog.makeSound();
        dog.sleep();

        // Animal animal = new Animal(); // Мы не можем создать объект на основе абстрактного класса!

        Cat cat = new Cat("Шарик");
        cat.makeSound();
        cat.eat();
    }
}
