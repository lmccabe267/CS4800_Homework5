import Decorator.FoodItem;
import Decorator.FoodItemDecorator;
import Decorator.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemDecoratorTest {

    @Test
    public void testGetPrice() {
        double expectedPrice = 10.0;
        Item foodItem = new FoodItem(expectedPrice, "Test Food Item");
        FoodItemDecorator foodItemDecorator = new FoodItemDecorator(foodItem);

        double actualPrice = foodItemDecorator.getPrice();

        assertEquals(expectedPrice, actualPrice, 0.01);
    }

    @Test
    public void testGetDescription() {
        String expectedDescription = "Test Food Item";
        Item foodItem = new FoodItem(10.0, expectedDescription);
        FoodItemDecorator foodItemDecorator = new FoodItemDecorator(foodItem);

        String actualDescription = foodItemDecorator.getDescription();

        assertEquals(expectedDescription, actualDescription);
    }
}
