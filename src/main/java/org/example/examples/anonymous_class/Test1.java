package org.example.examples.anonymous_class;

class Animal {
    Animal(String name) {
        System.out.println("Животное: " + name);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Animal cat = new Animal("Кот") { // Анонимный класс вызывает конструктор через super()
            void makeSound() {
                System.out.println("Мяу");
            }
        };
        //cat.makeSound(); // Ошибка! Метод makeSound() не доступен через Animal
    }
}