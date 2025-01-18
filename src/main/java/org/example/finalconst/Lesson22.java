package org.example.finalconst;

/**
 * Мы не можем назначить константе другое значение;
 * константы могут быть static
 * (принадлежать всему классу, делилась между всеми объектами);
 */
public class Lesson22 {
    public static void main(String[] args) {
        Test.CONSTANT2 = 10;

        final int X = 100;
        //X = 200; // Мы не можем изменить константу после инициализации
    }
}

class Test {
    public final int CONSTANT1 = 200;
    public static int CONSTANT2;

    // Мы не можем изменить константу после инициализации
    //public Test(int CONSTANT) {
    //    this.CONSTANT1 = CONSTANT;
    //}
}
