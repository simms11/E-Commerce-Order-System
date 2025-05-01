package ecommerce.model;


import ecommerce.discounts.FixedDiscount;
import ecommerce.discounts.PercentageDiscount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {
    private Product laptop;
    private Product mouse;
    private Order order;

    @BeforeEach
    void setUp() {
        laptop = new Product("Laptop", 1000, 5);
        mouse = new Product("Mouse", 50,10);
        order = new Order("O1001", List.of(laptop,mouse));
    }

    @Test
    void testCalculateTotal_withoutDiscount() {
        double total = order.calculateTotal();
        assertEquals(1050.0, total);
    }

    @Test
    void testCalculateTotal_withFixedDiscount() {
        order.applyDiscount(new FixedDiscount(100));
        double total = order.calculateTotal();
        assertEquals(950.0, total);
    }

    @Test
    void testCalculateTotal_withPercentageDiscount() {
        order.applyDiscount(new PercentageDiscount(10));
        double total = order.calculateTotal();
        assertEquals(945.0, total);
    }

    @Test
    void testUpdateStatus() {
        assertEquals(OrderStatus.PLACED, order.getStatus());
        order.updateStatus(OrderStatus.SHIPPED);
        assertEquals(OrderStatus.SHIPPED, order.getStatus());
    }
}