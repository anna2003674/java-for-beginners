package org.example.tregulov.nested_class.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        Engine e = new Engine(458);
        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
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

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                "horsePower=" + horsePower +
                '}';
        }
    }
}


class Test1 {
    public static void main(String[] args) {
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car);
        System.out.println(engine);

        Car.Engine engine2 = new Car("yellow", 4).new Engine(400);
    }
}