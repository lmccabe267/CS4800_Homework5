package Decorator;

public class FoodItem implements Item{

	private double price;
	private String description;
	
	public FoodItem(double price, String description) {
		this.price = price;
		this.description = description;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
