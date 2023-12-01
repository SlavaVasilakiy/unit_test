package ru.gb.test.seminars.first.hw;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    @Test
    public void testProductListAccuracy() {

        Shop shop = new Shop();

        Product product1 = new Product();
        product1.setTitle("Product 1");
        product1.setCost(10);

        Product product2 = new Product();
        product2.setTitle("Product 2");
        product2.setCost(20);

        shop.addProduct(product1);
        shop.addProduct(product2);

        assertEquals(2, shop.getProductCount());

        List<Product> expectedProducts = new ArrayList<>();
        expectedProducts.add(product1);
        expectedProducts.add(product2);
        assertEquals(expectedProducts, shop.getProducts());
    }

    @Test
    public void testGetMostExpensiveProduct() {

        Shop shop = new Shop();

        Product product1 = new Product();
        product1.setTitle("Product 1");
        product1.setCost(10);

        Product product2 = new Product();
        product2.setTitle("Product 2");
        product2.setCost(20);

        shop.addProduct(product1);
        shop.addProduct(product2);

        Product mostExpensive = shop.getMostExpensiveProduct();

        assertEquals(product2, mostExpensive);
    }

    @Test
    public void testSortProductsByPrice() {

        Shop shop = new Shop();

        Product product1 = new Product();
        product1.setTitle("Product 1");
        product1.setCost(10);

        Product product2 = new Product();
        product2.setTitle("Product 2");
        product2.setCost(20);

        shop.addProduct(product1);
        shop.addProduct(product2);

        shop.sortProductsByPrice();

        List<Product> sortedProducts = shop.getProducts();
        assertEquals(product1, sortedProducts.get(0));
        assertEquals(product2, sortedProducts.get(1));
    }
}
