package net.konic.corejava.constructor;

public class Car {
	/**
	 * Car Showroom (Static Counter)
	 * 
	 * Input: 3 cars created (BMW, Audi, Kia) Output: Total Cars Sold: 3
	 * 
	 * ✳ Task:
	 * 
	 * Use static variable carCount
	 * 
	 * Increment inside constructor
	 * 
	 * Print total sales
	 * 
	 */
	    String brand;

	    static int carCount = 0;

	    Car(String b) {
	        brand = b;
	        carCount++; 
	    }

	 
	    void showCar() {
	        System.out.println("Car: " + brand);
	    }

	    public static void main(String[] args) {

	        Car c1 = new Car("BMW");
	        Car c2 = new Car("Audi");
	        Car c3 = new Car("Kia");

	   
	        c1.showCar();
	        c2.showCar();
	        c3.showCar();

	        System.out.println("Total Cars Sold: " + carCount);
	    }
	}



