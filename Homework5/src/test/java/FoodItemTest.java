import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemTest {

    @Test
    public void testGetPrice() {
        double expectedPrice = 10.0;
        String description = "Test Food Item";
        FoodItem foodItem = new FoodItem(expectedPrice, description);

        double actualPrice = foodItem.getPrice();

        assertEquals(expectedPrice, actualPrice, 0.01);
    }

    @Test
    public void testGetDescription() {
        double price = 10.0;
        String expectedDescription = "Test Food Item";
        FoodItem foodItem = new FoodItem(price, expectedDescription);

        String actualDescription = foodItem.getDescription();

        assertEquals(expectedDescription, actualDescription);
    }
}
