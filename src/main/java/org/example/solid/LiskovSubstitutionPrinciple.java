package org.example.solid;

/**
 * Объекты дочернего класса должны быть заменяемы объектами родительского класса без нарушения работы программы.
 */
abstract class Shape {
    abstract int getArea();
}

class Rectangle extends Shape {
    protected int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    int getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    int getArea() {
        return side * side;
    }
}

public class LiskovSubstitutionPrinciple {
}