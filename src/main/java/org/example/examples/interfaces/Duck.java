package org.example.examples.interfaces;

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

public class Duck implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }
}
