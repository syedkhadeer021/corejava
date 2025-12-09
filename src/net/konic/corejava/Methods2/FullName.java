package net.konic.corejava.Methods2;

import java.util.Scanner;

public class FullName {
	String firstName;
	String lastName;

	// Method to read names
	public void readNames() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first name: ");
		firstName = sc.nextLine();

		System.out.print("Enter last name: ");
		lastName = sc.nextLine();
	}

	public String fullName() {
		return firstName + " " + lastName;
	}

	public static void main(String[] args) {

		FullName fullname = new FullName();

		fullname.readNames();

		String output = fullname.fullName();

		System.out.println("Full Name: " + output);
	}

}
