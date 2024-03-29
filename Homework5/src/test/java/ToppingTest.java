import Decorator.FoodItem;
import Decorator.Item;
import Decorator.Topping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToppingTest {

    @Test
    public void testGetPrice() {
        // Arrange
        double basePrice = 10.0;
        double toppingPrice = 5.0;
        Item foodItem = new FoodItem(basePrice, "Pizza");
        Topping topping = new Topping(foodItem, toppingPrice, "Extra Cheese");

        // Act
        double totalPrice = topping.getPrice();

        // Assert
        assertEquals(basePrice + toppingPrice, totalPrice, 0.01); // Use delta for double comparison
    }

    @Test
    public void testGetDescription() {
        // Arrange
        String baseDescription = "Pizza";
        String toppingDescription = "Extra Cheese";
        Item foodItem = new FoodItem(10.0, baseDescription);
        Topping topping = new Topping(foodItem, 5.0, toppingDescription);

        // Act
        String totalDescription = topping.getDescription();

        // Assert
        assertEquals(baseDescription + ", " + toppingDescription, totalDescription);
    }
}
