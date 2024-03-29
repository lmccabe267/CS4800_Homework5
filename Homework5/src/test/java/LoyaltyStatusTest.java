import Decorator.LoyaltyStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyStatusTest {

    @Test
    public void testApplyDiscount() {
        double discount = 0.1;
        double totalCost = 100.0;
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(discount);

        double discountedPrice = loyaltyStatus.applyDiscount(totalCost);

        assertEquals(totalCost * discount, discountedPrice, 0.01);
    }

    @Test
    public void testApplyDiscountWithZeroTotalCost() {
        double discount = 0.1;
        double totalCost = 0.0;
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(discount);

        double discountedPrice = loyaltyStatus.applyDiscount(totalCost);

        assertEquals(0.0, discountedPrice, 0.01);
    }

    @Test
    public void testApplyDiscountWithNegativeTotalCost() {
        double discount = 0.1;
        double totalCost = -100.0;
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(discount);

        double discountedPrice = loyaltyStatus.applyDiscount(totalCost);

        assertEquals(totalCost * discount, discountedPrice, 0.01);
    }
}
