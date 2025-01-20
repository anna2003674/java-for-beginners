package org.example.wildcards;

public class Animal {

    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public Animal() {
    }

    public String toString() {
        return String.valueOf(id);
    }

    public void eat() {
        System.out.println("Животное ест!");
    }
}
