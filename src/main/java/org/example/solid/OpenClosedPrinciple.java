package org.example.solid;

/**
 * Код должен быть открыт для расширения, но закрыт для модификации.
 */
interface Discount {
    double apply(double price);
}

class VipDiscount implements Discount {
    public double apply(double price) {
        return price * 0.9;
    }
}

class RegularDiscount implements Discount {
    public double apply(double price) {
        return price * 0.95;
    }
}

public class OpenClosedPrinciple {
}
