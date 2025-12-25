package net.konic.corejava.inheritance;

 class Vehicle {
	String brand = "Honda";
}

class Car extends Vehicle {
	int speed = 120;
}

public class VehicleCarDemo {
	public static void main(String[] args) {

		Car c = new Car();

		System.out.println("Brand: " + c.brand);
		System.out.println("Speed: " + c.speed);
	}
}
