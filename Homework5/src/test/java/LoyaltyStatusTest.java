import Decorator.LoyaltyStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyStatusTest {

    @Test
    public void testApplyDiscount() {
        // Arrange
        double discount = 0.1; // 10%
        double totalCost = 100.0;
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(discount);

        // Act
        double discountedPrice = loyaltyStatus.applyDiscount(totalCost);

        // Assert
        assertEquals(totalCost * discount, discountedPrice, 0.01); // Use delta for double comparison
    }

    @Test
    public void testApplyDiscountWithZeroTotalCost() {
        // Arrange
        double discount = 0.1; // 10%
        double totalCost = 0.0;
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(discount);

        // Act
        double discountedPrice = loyaltyStatus.applyDiscount(totalCost);

        // Assert
        assertEquals(0.0, discountedPrice, 0.01); // Use delta for double comparison
    }

    @Test
    public void testApplyDiscountWithNegativeTotalCost() {
        // Arrange
        double discount = 0.1; // 10%
        double totalCost = -100.0;
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(discount);

        // Act
        double discountedPrice = loyaltyStatus.applyDiscount(totalCost);

        // Assert
        assertEquals(totalCost * discount, discountedPrice, 0.01); // Use delta for double comparison
    }
}
