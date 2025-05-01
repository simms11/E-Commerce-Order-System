package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private List<Order> orders = new ArrayList<>();

    public Customer(String id, String name) {
        super(id, name);
    }

    @Override
    public void printRole() {
        System.out.println("Customer");
    }

    public List<Order> getOrders() {
        return orders;
    }
}
