import Decorator.FoodItem;
import Decorator.FoodItemDecorator;
import Decorator.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemDecoratorTest {

    @Test
    public void testGetPrice() {
        // Arrange
        double expectedPrice = 10.0;
        Item foodItem = new FoodItem(expectedPrice, "Test Food Item");
        FoodItemDecorator foodItemDecorator = new FoodItemDecorator(foodItem);

        // Act
        double actualPrice = foodItemDecorator.getPrice();

        // Assert
        assertEquals(expectedPrice, actualPrice, 0.01); // Use delta for double comparison
    }

    @Test
    public void testGetDescription() {
        // Arrange
        String expectedDescription = "Test Food Item";
        Item foodItem = new FoodItem(10.0, expectedDescription);
        FoodItemDecorator foodItemDecorator = new FoodItemDecorator(foodItem);

        // Act
        String actualDescription = foodItemDecorator.getDescription();

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
}
