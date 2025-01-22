package org.example.lesson47;

public class Electrocar {
    private int id;

    // вложенный нестатический класс (имеем доступ к полям объекта)
    private class Motor {
        public void startMotor() {
            System.out.println("Motor is starting...");
        }
    }

    // вложенный статический класс (не имеет досутпа к полям объекта)
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 1;
        // вложенный в методе класс
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }
        System.out.println("Electrocar " + id + "is starting...");
    }
}
