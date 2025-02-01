package org.example.examples.static_keywords;

public class Outer {
    static class Inner {
        void showMessage() {
            System.out.println("Привет из static вложенного класса!");
        }
    }
}

class Main4 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // Создание объекта без внешнего класса
        obj.showMessage();
    }
}