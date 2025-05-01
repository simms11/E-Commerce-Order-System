package ecommerce.service;

import ecommerce.model.Order;
import ecommerce.model.OrderStatus;

public class OrderService {
    public void cancelOrder(Order order){
        order.updateStatus(OrderStatus.CANCELLED);
    }

    public void shipOrder(Order order){
        order.updateStatus(OrderStatus.SHIPPED);
    }
}
