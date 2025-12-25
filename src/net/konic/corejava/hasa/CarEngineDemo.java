package net.konic.corejava.hasa;

class Engine {
 void startEngine() {
     System.out.println("Engine started");
 }
}

class Car {
 Engine engine = new Engine();

 void move() {
     engine.startEngine();
     System.out.println("Car is moving");
 }
}

public class CarEngineDemo {
 public static void main(String[] args) {
     Car car = new Car();
     car.move();
 }
}
