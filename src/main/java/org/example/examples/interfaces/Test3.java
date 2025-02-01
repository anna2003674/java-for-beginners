package org.example.examples.interfaces;

interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Square(4);

        System.out.println(shape1.getArea()); // 78.54
        System.out.println(shape2.getArea()); // 16
    }
}
