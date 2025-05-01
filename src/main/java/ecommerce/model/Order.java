package ecommerce.model;

import ecommerce.discounts.Discount;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private LocalDateTime createdAt;
    private OrderStatus status;
    private Discount discount;

    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.createdAt = LocalDateTime.now();
        this.status = OrderStatus.PLACED;
    }

    public double calculateTotal() {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        return (discount != null) ? discount.apply(total) : total;
    }

    public void applyDiscount(Discount discount) {
        this.discount = discount;
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
