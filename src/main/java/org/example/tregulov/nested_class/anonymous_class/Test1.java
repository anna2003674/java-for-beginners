package org.example.tregulov.nested_class.anonymous_class;

public class Test1 {
    private int x = 5;

    public static void main(String[] args) {
        Math m = new Math() {
            int c = 1;

            void abc() {
                System.out.println("abc");
            }

            @Override
            public int doOperation(int a, int b) {
                Test1 test1 = new Test1();
                return a + b + test1.x;
            }
        };
        int result = m.doOperation(4, 7);
        System.out.println(result);

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        int result2 = m2.doOperation(4, 5);
        System.out.println(result2);

        Math2 m3 = new Math2() {
            @Override
            int doOperation(int a, int b) {
                return a / b;
            }
        };
        int result3 = m3.doOperation(10, 3);
        System.out.println(result3);
    }
}

interface Math {
    int doOperation(int a, int b);
}

class Math2 {
    int doOperation(int a, int b) {
        return a / b;
    }
}