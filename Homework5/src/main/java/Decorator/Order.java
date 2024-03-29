package Decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Item> foodItems = new ArrayList<>();
	
	public void addItem(Item item) {
		foodItems.add(item);
	}
	
	public double getTotalCost() {
		double totalCost = 0;
		for(Item foodItem: foodItems) {
			totalCost += foodItem.getPrice();
		}
		return totalCost;
	}
	
	public String getOrderDescription() {
		String description = "";
		for(Item foodItem: foodItems) {
			description += foodItem.getDescription() + "\n";
		}
		return description;
	}
}
