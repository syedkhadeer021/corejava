package net.konic.corejava.overloading;

public class SuperMarket {
	/**
	 * Bill Generation – Supermarket QUESTION:
	 * 
	 * Overload generateBill() with discount & tax.
	 * 
	 * INPUT: generateBill(1000) generateBill(1000, 10) generateBill(1000, 10, 5)
	 * 
	 * OUTPUT: Final Bill: ₹1000 Final Bill after discount: ₹900 Final Bill: ₹945
	 * 
	 */

	void generateBill(double amount) {
		System.out.println("Final Bill: ₹" + amount);
	}

	void generateBill(double amount, double discount) {
		double finalAmount = amount - (amount * discount / 100);
		System.out.println("Final Bill after discount: ₹" + finalAmount);
	}

	void generateBill(double amount, double discount, double tax) {
		double discounted = amount - (amount * discount / 100);
		double finalAmount = discounted + (discounted * tax / 100);
		System.out.println("Final Bill: ₹" + finalAmount);
	}

	public static void main(String[] args) {

		SuperMarket s = new SuperMarket();

		s.generateBill(1000);
		s.generateBill(1000, 10);
		s.generateBill(1000, 10, 5);
	}
}
