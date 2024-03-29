package Decorator;

public class LoyaltyStatus {
	
	private double discount;
	
	public LoyaltyStatus(double discount) {
		this.discount = discount;
	}
	
	public double applyDiscount(double totalCost) {
		return totalCost * discount;
	}
}
