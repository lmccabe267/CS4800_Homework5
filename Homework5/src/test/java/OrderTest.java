import Decorator.FoodItem;
import Decorator.Item;
import Decorator.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order();
    }

    @Test
    public void testAddItemAndGetTotalCost() {
        // Arrange
        double expectedTotalCost = 25.0;
        Item foodItem1 = new FoodItem(10.0, "Pizza");
        Item foodItem2 = new FoodItem(15.0, "Burger");

        // Act
        order.addItem(foodItem1);
        order.addItem(foodItem2);
        double actualTotalCost = order.getTotalCost();

        // Assert
        assertEquals(expectedTotalCost, actualTotalCost, 0.01); // Use delta for double comparison
    }

    @Test
    public void testGetOrderDescription() {
        // Arrange
        String expectedDescription = "Pizza\nBurger\n";
        Item foodItem1 = new FoodItem(10.0, "Pizza");
        Item foodItem2 = new FoodItem(15.0, "Burger");

        // Act
        order.addItem(foodItem1);
        order.addItem(foodItem2);
        String actualDescription = order.getOrderDescription();

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    public void testGetTotalCostWithNoItems() {
        // Arrange
        double expectedTotalCost = 0.0;

        // Act
        double actualTotalCost = order.getTotalCost();

        // Assert
        assertEquals(expectedTotalCost, actualTotalCost, 0.01); // Use delta for double comparison
    }

    @Test
    public void testGetOrderDescriptionWithNoItems() {
        // Arrange
        String expectedDescription = "";

        // Act
        String actualDescription = order.getOrderDescription();

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
}
