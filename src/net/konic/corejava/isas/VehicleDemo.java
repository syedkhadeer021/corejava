package net.konic.corejava.isas;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle{
	void start() {
		System.out.println("car starts with key");
	}
}
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike start with kick");
	}
}

public class VehicleDemo {
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		Bike bike = new Bike();
		bike.start();
		
	}

}
