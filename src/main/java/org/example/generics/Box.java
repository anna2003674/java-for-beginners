package org.example.generics;

/**
 * Параметризация класса
 */
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>(); // Параметризация String
        box1.setItem("Hello, Generics");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<>(); // Параметризация Integer
        box2.setItem(100);
        System.out.println(box2.getItem());
    }
}
