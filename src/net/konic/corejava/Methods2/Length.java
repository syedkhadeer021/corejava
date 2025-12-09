package net.konic.corejava.Methods2;

import java.util.Scanner;

public class Length {
	/**
	 * Check Name Length
	 * 
	 * Instance variable: fullName
	 * 
	 * Method readFullName() → local Scanner
	 * 
	 * Method isLongName() → return boolean (true if > 10 chars)
	 * 
	 * Print output in main
	 */
	String fullName;

	public void readFullName() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full name: ");
		fullName = sc.nextLine();
	}

	public boolean isLongName() {
		return fullName.length() > 10;
	}

	public static void main(String[] args) {

		Length length = new Length();

		length.readFullName();

		boolean result = length.isLongName();

		System.out.println("Boolean Value: " + result);

		if (result) {
			System.out.println("Name is LONG");
		} else {
			System.out.println("Name is SHORT");
		}
	}

}
