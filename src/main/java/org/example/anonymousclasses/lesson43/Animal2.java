package org.example.anonymousclasses.lesson43;

public class Animal2 {
    void speak() {
        System.out.println("Animal is speaking");
    }
}

class Main2 {
    public static void main(String[] args) {
        // Создается анонимный класс, который наследует класс Animal2 и переопределяет его метод speak()
        Animal2 animal = new Animal2() {
            @Override
            public void speak() {
                System.out.println("Анонимный класс изменяет поведение метода speak");
            }
        };
        animal.speak();
    }
}
