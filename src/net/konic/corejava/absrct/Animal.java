package net.konic.corejava.absrct;

abstract class Animal1 {
	abstract void sound();
}

class Dog extends Animals {
	void sound() {
		System.out.println("bow bow");
	}

}

class Cat extends Animals {
	void sound() {
		System.out.println("meow meow");
	}
}

public class Animal {
	public static void main(String args[]) {
		Animals a = new Dog();
		Animals b = new Cats();
		a.sound();
		b.sound();
	}
}