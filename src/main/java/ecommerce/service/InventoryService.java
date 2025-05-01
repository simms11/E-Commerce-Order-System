package ecommerce.service;

import ecommerce.model.Product;

public class InventoryService {
    public boolean checkStock(Product product, int quantity) {
        return product.getStockQuantity() >= quantity;
    }

    public void reduceStock(Product product, int quantity) {
        product.reduceStock(quantity);
    }

    public void restock(Product product, int quantity) {
        product.restock(quantity);
    }
}
