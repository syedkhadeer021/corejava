package net.konic.test1;

public class Restaurant {
	/**
	 * ⿡ Restaurant Ordering System
	 * 
	 * Task: Create a class Restaurant with:
	 * 
	 * public constructor → sets customer name
	 * 
	 * static variable → restaurantName
	 * 
	 * non-static method → orderFood(int choice) using switch
	 * 
	 * default constructor → sets "Walk-in Customer"
	 * 
	 * private constructor → internal use only Input: choice = 1 (Pizza) Output:
	 * Added: Pizza (₹200)
	 * 
	 */

	static String restaurantName = "Food Palace";
	String customerName;

	public Restaurant() {
		customerName = "Walk-in Customer";
	}

	public Restaurant(String name) {
		customerName = name;
	}

	private Restaurant(int x) {
		customerName = "VIP Customer";
	}

	public void orderFood(int choice) {
		switch (choice) {
		case 1:
			System.out.println("Added: Pizza (₹200)");
			break;
		case 2:
			System.out.println("Added: Burger (₹150)");
			break;
		case 3:
			System.out.println("Added: Sandwich (₹120)");
			break;
		case 4:
			System.out.println("Added: Pasta (₹180)");
			break;
		default:
			System.out.println("Invalid Choice!");
		}
	}

	public static void main(String[] args) {

		Restaurant r1 = new Restaurant();
		System.out.println("Customer: " + r1.customerName);
		r1.orderFood(1);

		System.out.println();

		Restaurant r2 = new Restaurant("syed");
		System.out.println("Customer: " + r2.customerName);
		r2.orderFood(2);
	}
}
