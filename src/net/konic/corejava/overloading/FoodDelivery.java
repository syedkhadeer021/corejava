package net.konic.corejava.overloading;

public class FoodDelivery {
	/**
	 * Food Delivery – Zomato/Swiggy QUESTION:
	 * 
	 * Overload order() for qty and spicy option.
	 * 
	 * INPUT: order("Biryani") order("Biryani", 2) order("Biryani", 2, true)
	 * 
	 * OUTPUT: Order placed: Biryani (1 qty) Order placed: Biryani (2 qty) Order
	 * placed: Biryani (2 qty, Spicy)
	 * 
	 */

	void order(String item) {
		System.out.println("Order placed: " + item + " (1 qty)");
	}

	void order(String item, int qty) {
		System.out.println("Order placed: " + item + " (" + qty + " qty)");
	}

	void order(String item, int qty, boolean spicy) {
		if (spicy)
			System.out.println("Order placed: " + item + " (" + qty + " qty, Spicy)");
		else
			System.out.println("Order placed: " + item + " (" + qty + " qty, Non-Spicy)");
	}

	public static void main(String[] args) {
		FoodDelivery f = new FoodDelivery();

		f.order("Biryani");
		f.order("Biryani", 2);
		f.order("Biryani", 2, true);
	}
}
