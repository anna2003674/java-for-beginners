package org.example.solid;

/**
 * Лучше много маленьких интерфейсов, чем один огромный.
 */
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Человек работает");
    }

    public void eat() {
        System.out.println("Человек ест");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Робот работает");
    }
}

public class InterfaceSegregationPrinciple {
}
