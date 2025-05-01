package ecommerce.discounts;


import ecommerce.discounts.Discount;

public class FixedDiscount implements Discount {
    private double amount;

    public FixedDiscount(double amount){
        this.amount = amount;
    }

    @Override
    public double apply(double total){
        return total - amount;
    }
}
