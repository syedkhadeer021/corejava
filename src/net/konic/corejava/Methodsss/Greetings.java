package net.konic.corejava.Methodsss;

public class Greetings {
	public String greet(String greet) {
		System.out.println("greeting " + greet);
		return greet;

	}

	public static void main(String[] args) {
		Greetings greeting = new Greetings();
		greeting.greet("hello");
	}

}
