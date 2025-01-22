package org.example.anonymousclasses.lesson43;

/**
 * Анонимные классы в Java — это классы без имени,
 * которые используются для создания объекта и его реализации "на лету".
 * Они обычно применяются для удобства, когда нужно создать класс,
 * реализующий интерфейс или наследующий другой класс,
 * но переопределяющий только несколько методов.
 * Анонимные классы удобны для: создания кратковременных объектов для одноразового использования.
 */
interface AbleToEat {
    void eat();
}

class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        ableToEat.eat();
    }
}
