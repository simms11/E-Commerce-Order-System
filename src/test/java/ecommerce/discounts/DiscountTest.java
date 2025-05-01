package ecommerce.discounts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountTest {


    @Test
    void testFixedDiscount() {
        Discount discount = new FixedDiscount(100);
        double result = discount.apply(500);
        assertEquals(400.0, result);
    }

    @Test
    void testPercentageDiscount() {
        Discount discount = new PercentageDiscount(20);
        double result = discount.apply(200);
        assertEquals(160.0, result);
    }

    @Test
    void testFixedDiscount_exceedsTotal() {
        Discount discount = new FixedDiscount(600);
        double result = discount.apply(500);
        assertEquals(-100.0, result);
    }

    @Test
    void testPercentageDiscount_zeroPercent() {
        Discount discount = new PercentageDiscount(0);
        double result = discount.apply(300);
        assertEquals(300.0, result);
    }
}
