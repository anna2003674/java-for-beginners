package org.example.tregulov.nested_class.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine engine1 = new Engine(243);
        System.out.println(engine1.horsePower);
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
            "color='" + color + '\'' +
            ", doorCount=" + doorCount +
            ", engine=" + engine +
            '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
            System.out.println(a);
        }

        @Override
        public String toString() {
            return "Engine{" +
                "horsePower=" + horsePower +
                '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}