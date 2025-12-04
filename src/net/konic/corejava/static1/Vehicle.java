package net.konic.corejava.static1;

public class Vehicle {
	/**
	 * Create a class Vehicle • static variable: wheels = 4 • instance variable:
	 * brand Task: Print wheels using class name Print brand using object
	 * 
	 * 
	 */
	    static int wheels = 4;

	    String brand;

	    public static void main(String[] args) {

	        System.out.println("Wheels: " + Vehicle.wheels);

	        Vehicle v = new Vehicle();
	        v.brand = "BMW";

	        System.out.println("Brand: " + v.brand);
	    }
	}


