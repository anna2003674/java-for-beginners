package org.example.tregulov.nested_class;

public class Test1 {
    // static nested class
    static class A {
    }

    // inner class
    class B {
    }

    void method() {
        // локальный класс
        class C {
        }
    }

    public static void main(String[] args) {
        Greeting g = new Greeting() { // Анонимный класс
            public void sayHello() {
                System.out.println("Привет из анонимного класса");
            }
        };
        g.sayHello();
    }
}

interface Greeting {
    void sayHello();
}