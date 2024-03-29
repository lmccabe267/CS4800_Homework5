import Decorator.FoodItem;
import Decorator.Item;
import Decorator.Topping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToppingTest {
    @Test
    public void testGetPrice() {
        double basePrice = 10.0;
        double toppingPrice = 5.0;
        Item foodItem = new FoodItem(basePrice, "Pizza");
        Topping topping = new Topping(foodItem, toppingPrice, "Extra Cheese");

        double totalPrice = topping.getPrice();

        assertEquals(basePrice + toppingPrice, totalPrice, 0.01);
    }

    @Test
    public void testGetDescription() {
        String baseDescription = "Pizza";
        String toppingDescription = "Extra Cheese";
        Item foodItem = new FoodItem(10.0, baseDescription);
        Topping topping = new Topping(foodItem, 5.0, toppingDescription);

        String totalDescription = topping.getDescription();

        assertEquals(baseDescription + ", " + toppingDescription, totalDescription);
    }
}
