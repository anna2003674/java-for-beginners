package org.example.design_patterns.creational_patterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder (Строитель)
 * Используется для создания сложного объекта с использованием простых объектов.
 * Постепенно он создает больший объект от малого и простого объекта.
 */
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}

enum PaymentMethod {
    CREDIT_CARD,
    PAYPAL,
    BANK_TRANSFER
}

// Сложный объект, который строится
class Order {
    private List<Product> products;
    private Address shippingAddress;
    private PaymentMethod paymentMethod;

    public Order(List<Product> products, Address shippingAddress, PaymentMethod paymentMethod) {
        this.products = products;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
            "products=" + products +
            ", shippingAddress=" + shippingAddress +
            ", paymentMethod=" + paymentMethod +
            '}';
    }
}

// Builder (Строитель) для создания заказов
class OrderBuilder {
    private List<Product> products = new ArrayList<>();
    private Address shippingAddress;
    private PaymentMethod paymentMethod;

    public OrderBuilder addProduct(Product product) {
        this.products.add(product);
        return this;
    }

    public OrderBuilder setShippingAddress(Address address) {
        this.shippingAddress = address;
        return this;
    }

    public OrderBuilder setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public Order build() {
        return new Order(products, shippingAddress, paymentMethod);
    }
}

public class Builder {
    public static void main(String[] args) {
        // Строим заказ с помощью Builder
        Order order = new OrderBuilder()
            .addProduct(new Product("Laptop", 1000.00))
            .addProduct(new Product("Mouse", 25.50))
            .setShippingAddress(new Address("123 Main St", "New York"))
            .setPaymentMethod(PaymentMethod.CREDIT_CARD)
            .build();
        System.out.println(order);
    }
}
