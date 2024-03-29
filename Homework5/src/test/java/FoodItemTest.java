import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemTest {

    @Test
    public void testGetPrice() {
        // Arrange
        double expectedPrice = 10.0;
        String description = "Test Food Item";
        FoodItem foodItem = new FoodItem(expectedPrice, description);

        // Act
        double actualPrice = foodItem.getPrice();

        // Assert
        assertEquals(expectedPrice, actualPrice, 0.01); // Use delta for double comparison
    }

    @Test
    public void testGetDescription() {
        // Arrange
        double price = 10.0;
        String expectedDescription = "Test Food Item";
        FoodItem foodItem = new FoodItem(price, expectedDescription);

        // Act
        String actualDescription = foodItem.getDescription();

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
}
