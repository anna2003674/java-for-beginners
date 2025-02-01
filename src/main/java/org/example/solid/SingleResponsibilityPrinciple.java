package org.example.solid;

/**
 * Каждый класс должен иметь только одну причину для изменения, то есть выполнять лишь одну задачу.
 */
class Order {
    void calculateTotal() { /* Логика расчета суммы заказа */ }
}

class OrderPrinter {
    void printOrder(Order order) { /* Вывод заказа на печать */ }
}

class OrderRepository {
    void saveToDatabase(Order order) { /* Сохранение заказа в БД */ }
}

public class SingleResponsibilityPrinciple {
}
