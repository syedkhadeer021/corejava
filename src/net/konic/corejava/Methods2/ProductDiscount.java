package net.konic.corejava.Methods2;

import java.util.Scanner;

public class ProductDiscount {
	/**
	 * Product Discount System
	 * 
	 * Instance variable: price
	 * 
	 * Method readPrice() → local Scanner
	 * 
	 * Method getDiscount() → return discounted price
	 * 
	 * Display final amount.
	 * 
	 * 
	 */
	    double price; 
	    public void readPrice() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter product price: ");
	        double p = sc.nextDouble(); 

	        price = p;  
	    }
	    public double getDiscount() {
	        return price - (price * 0.10);
	    }

	    public static void main(String[] args) {

	        ProductDiscount productdiscount = new ProductDiscount();

	        productdiscount.readPrice();   

	        double finalAmount = productdiscount.getDiscount();  

	        System.out.println("Final Price After 10% Discount: " + finalAmount);
	    }
	}


