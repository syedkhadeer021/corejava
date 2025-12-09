package net.konic.corejava.constructor;

public class ShoppingOrder {
/**
 * Shopping Order (Static Discount)

Input: price=1000, static discount=10%
Output:
Final Price: 900

✳ Task:

Static variable discount

Method applyDiscount() returns discounted price

Constructor sets price

 */

	    static double discount = 10;  
	    double price;

	    ShoppingOrder(double p) {
	        price = p;
	    }
	    double applyDiscount() {
	        return price * (1 - discount / 100);
	    }

	    void showFinalPrice() {
	        System.out.println("Final Price: " + applyDiscount());
	    }

	    public static void main(String[] args) {

	        ShoppingOrder order = new ShoppingOrder(1000.2);

	        order.showFinalPrice();
	    }
	}


