package org.example.examples.anonymous_class;

class Parent {
    Parent(String message) {
        System.out.println("Сообщение от родителя: " + message);
    }
}

public class Test6 {
    public static void main(String[] args) {
        Parent obj = new Parent("Привет!") { // Анонимный класс вызывает super()
            void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }
        };
        // obj.sayHello(); // Ошибка! Parent не имеет метода sayHello
    }
}
