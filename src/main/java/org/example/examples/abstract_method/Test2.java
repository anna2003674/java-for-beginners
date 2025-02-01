package org.example.examples.abstract_method;

interface Flyable {
    void fly(); // Абстрактный метод (abstract писать не нужно)
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Птица летит!");
    }
}

class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Самолёт взлетает!");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly(); // Выведет: Птица летит!

        Flyable plane = new Plane();
        plane.fly(); // Выведет: Самолёт взлетает!
    }
}
