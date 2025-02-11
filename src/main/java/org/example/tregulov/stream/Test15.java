package org.example.tregulov.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Группировка товаров по категории с подсчетом количества
 */
public class Test15 {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", "Electronics"),
            new Product("Phone", "Electronics"),
            new Product("Shirt", "Clothing"),
            new Product("Jeans", "Clothing"),
            new Product("TV", "Electronics")
        );
        Map<String, Long> productCountByCategory = products.stream()
            .collect(Collectors.groupingBy(p -> p.category, Collectors.counting()));
        System.out.println(productCountByCategory);
    }
}

class Product {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
