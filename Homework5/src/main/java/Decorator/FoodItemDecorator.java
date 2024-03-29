package Decorator;

public class FoodItemDecorator implements Item{

	private Item foodItem;
	
	public FoodItemDecorator(Item foodItem) {
		this.foodItem = foodItem;
	}
	
	@Override
	public double getPrice() {
		return foodItem.getPrice();
	}

	@Override
	public String getDescription() {
		return foodItem.getDescription();
	}

}
