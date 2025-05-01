package ecommerce;

import ecommerce.model.*;
import ecommerce.service.*;
import ecommerce.discounts.PercentageDiscount;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "Jane Doe");
        Product laptop = new Product("Laptop", 1000, 5);
        Product mouse = new Product("Mouse", 50, 10);

        InventoryService inventoryService = new InventoryService();
        if (!inventoryService.checkStock(laptop, 1) || !inventoryService.checkStock(mouse, 1)) {
            System.out.println("Insufficient stock to place order.");
            return;
        }

        inventoryService.reduceStock(laptop, 1);
        inventoryService.reduceStock(mouse, 1);

        Order order = new Order("O001", List.of(laptop, mouse));
        order.applyDiscount(new PercentageDiscount(10));

        OrderService orderService = new OrderService();
        System.out.println("Total Price: " + order.calculateTotal());

        orderService.shipOrder(order);
        System.out.println("Order Status: " + order.getStatus());
    }
}
