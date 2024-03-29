package Decorator;

public class Driver {
	public static void main(String[] args) {
		Item burger = new FoodItem(4.99, "Burger");
		Item fries = new FoodItem(2.99, "Fries");
		Item hotdog = new FoodItem(3.99, "Hot Dog");
		
		Item deluxeBurger = new Topping(burger, 1.00, "Cheese");
		Item deluxeFries = new Topping(fries, 0.50, "ketchup");
		Item deluxeHotDog = new Topping(hotdog, 1.50, "Relish");
		
		Order order = new Order();
		order.addItem(deluxeBurger);
		order.addItem(deluxeFries);
		order.addItem(deluxeHotDog);
		
		double total = order.getTotalCost();
		
		LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.75);
		double totalWithDiscount = loyaltyStatus.applyDiscount(total);
		
		System.out.println(order.getOrderDescription());
		System.out.println("Total before discount: " + total);
		System.out.println("Total after discount: " + totalWithDiscount);
		
	}
}
