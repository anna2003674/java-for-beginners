package org.example.design_patterns.creational_patterns.singleton;

/**
 * Singleton (Одиночка)
 * Ограничивает создание одного экземпляра класса и обеспечивает доступ к его единственному объекту.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

class Test1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(); // Метод getInstance() создаёт объект только при первом вызове, а затем возвращает тот же экземпляр.
        singleton.showMessage();
    }
}
