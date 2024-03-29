package Decorator;

public class Topping extends FoodItemDecorator{

	private double price;
	private String description;
	
	public Topping(Item foodItem, double price, String description) {
		super(foodItem);
		this.price = price;
		this.description = description;
	}
	
	public double getPrice() {
		return super.getPrice() + price;
	}
	
	public String getDescription() {
		return super.getDescription() + ", " + description;
	}

}
