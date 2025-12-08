package net.konic.corejava.overloading;

public class Student {

	/**
	 * Student Registration QUESTION:
	 * 
	 * Overload register() to accept 1, 2, or 3 parameters.
	 * 
	 * INPUT: register("Rahul") register("Rahul", 20) register("Rahul", 20,
	 * "Hyderabad")
	 * 
	 * OUTPUT: Registered: Rahul Registered: Rahul, Age: 20 Registered: Rahul, Age:
	 * 20, City: Hyderabad
	 * 
	 * 
	 */

	void register(String name) {
		System.out.println("Registered: " + name);
	}

	void register(String name, int age) {
		System.out.println("Registered: " + name + ", Age: " + age);
	}

	void register(String name, int age, String city) {
		System.out.println("Registered: " + name + ", Age: " + age + ", City: " + city);
	}

	public static void main(String[] args) {
		Student s = new Student();

		s.register("Rahul");
		s.register("Rahul", 20);
		s.register("Rahul", 20, "Hyderabad");
	}
}
