package org.example.tregulov.nested_class.local_inner_class;

public class Test1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.gerResult();
    }
}

class Math {
    private int a = 10;

    public void gerResult() {
        class Division {
            private int dividend;
            private int divider;

            public int getDividend() {
                return dividend;
            }

            public void setDividend(int dividend) {
                this.dividend = dividend;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public int getChastnoe() {
                return dividend / divider;
            }

            public int getOstatok() {
                System.out.println(a);
                return dividend % divider;
            }
        }

        Division division = new Division();
        division.setDividend(21);
        division.setDivider(4);
        System.out.println(division.getDividend());
        System.out.println(division.getDivider());
        System.out.println(division.getChastnoe());
        System.out.println(division.getOstatok());
    }
}