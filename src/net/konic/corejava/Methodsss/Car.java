package net.konic.corejava.Methodsss;

/**
 * Method with Object as return type: Write a method that creates a Car object,
 * sets brand + price, and returns the Car object
 */

public class Car {

	public void car(String a, String b) {
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {
		Car car = new Car();
		car.car("Rolls Royce", "khadeer");

	}
}
