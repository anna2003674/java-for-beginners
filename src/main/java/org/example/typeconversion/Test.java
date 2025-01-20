package org.example.typeconversion;

public class Test {
    public static void main(String[] args) {
        float f1 = 123.5F;
        float f2 = (float) 123.5;

        long l = 1212L;
        int x = (int) l; // явное преобразование
        System.out.println(x);

        int a = 123;
        long b = a; // неявное преобразование

        int num = 12;
        double m = num;
        System.out.println(m);

        double num1 = 528.3;
        int x1 = (int) num1; // теряем вещественную часть
        System.out.println(x1);

        double h1 = 123.6;
        double g1 = Math.round(h1); // округление в большую сторону
        System.out.println(g1); // 124


        byte x2 = (byte) 128;
        System.out.println(x2); // -128

        byte x3 = (byte) 129;
        System.out.println(x3); // -127
    }
}
