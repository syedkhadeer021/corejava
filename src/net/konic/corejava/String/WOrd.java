package net.konic.corejava.String;

public class WOrd {
	public static void main(String[] args) {

		String sentence = "Welcome to Konic Technologies";

		int count = sentence.trim().split("\\s+").length;

		System.out.println("Word Count: " + count);
	}
}
