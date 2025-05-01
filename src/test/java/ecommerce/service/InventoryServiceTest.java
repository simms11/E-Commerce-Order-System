package ecommerce.service;

import ecommerce.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    private InventoryService inventoryService;
    private Product product;

    @BeforeEach
    void setUp() {
        inventoryService = new InventoryService();
        product = new Product("Keyboard", 75.0, 10);
    }

    @Test
    void testCheckStock_sufficientQuantity() {
        boolean result = inventoryService.checkStock(product, 5);
        assertTrue(result);
    }

    @Test
    void testCheckStock_insufficientQuantity() {
        boolean result = inventoryService.checkStock(product, 20);
        assertFalse(result);
    }

    @Test
    void testReduceStock() {
        inventoryService.reduceStock(product, 3);
        assertEquals(7, product.getStockQuantity());
    }

    @Test
    void testRestock() {
        inventoryService.restock(product, 5);
        assertEquals(15, product.getStockQuantity());
    }
}
