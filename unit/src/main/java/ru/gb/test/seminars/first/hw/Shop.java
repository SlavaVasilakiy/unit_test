package ru.gb.test.seminars.first.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public void sortProductsByPrice() {
        Collections.sort(products, Comparator.comparingInt(Product::getCost));
    }

    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            throw new IllegalStateException("Список продуктов пуст.");
        }
        return Collections.max(products, Comparator.comparingInt(Product::getCost));
    }

    public void addProduct(Product product) {
        if (products == null) {
            products = new ArrayList<>();
        }
        products.add(product);
    }

    public int getProductCount() {
        return products != null ? products.size() : 0;
    }

    public List<Product> getProducts() {
        return products;
    }

}
