package ecommerce.discounts;

public class PercentageDiscount implements Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double total) {
        return total * (1 - percentage / 100.0);
    }
}
