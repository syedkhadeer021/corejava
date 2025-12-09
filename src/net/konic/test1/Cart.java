package net.konic.test1;

public class Cart {
	/**
	 * Online Shopping Cart
	 * 
	 * Task: Class Cart:
	 * 
	 * static variable → websiteName
	 * 
	 * public constructor → set customerName
	 * 
	 * non-static method → addItem(int itemId) using switch
	 * 
	 * private constructor → internal logging
	 * 
	 * 
	 * Input: itemId = 1 Output: Added: Shoes (₹1500)
	 * 
	 */
	
	    static String websiteName = "Flipcart";
	    String customerName;

	    public Cart(String name) {
	        customerName = name;
	    }

	    public void addItem(int itemId) {
	        switch(itemId) {
	            case 1:
	                System.out.println("Added: Shoes (₹1500)");
	                break;

	            case 2:
	                System.out.println("Added: T-Shirt (₹700)");
	                break;

	            case 3:
	                System.out.println("Added: Jeans (₹1200)");
	                break;

	            case 4:
	                System.out.println("Added: Watch (₹2500)");
	                break;

	            default:
	                System.out.println("Invalid Item!");
	        }
	    }

	    public static void main(String[] args) {

	        Cart c = new Cart("Khadeer");
	        System.out.println("Customer: " + c.customerName);
	        System.out.println("Website: " + Cart.websiteName);

	        c.addItem(1);   
	    }
	}



