package net.konic.corejava.oprators;

import java.util.Scanner;

public class AllOperator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/**
		 * 1) Arithmetic Operators
		 * 
		 * Input: itemPrice, quantity Output: totalPrice, tax, finalBill
		 * 
		 */
		System.out.print("Enter Item Price: ");
		double itemPrice = sc.nextDouble();

		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();

		// Calculations
		double totalPrice = itemPrice * quantity; // Arithmetic operator (*)
		double tax = totalPrice * 0.10; // 10% tax
		double finalBill = totalPrice + tax; // Arithmetic operator (+)

		// Output
		System.out.println("Total Price: " + totalPrice);
		System.out.println("Tax (10%): " + tax);
		System.out.println("Final Bill: " + finalBill);

		/**
		 * 2) Arithmetic – Temperature Conversion
		 * 
		 * Input: Celsius or Fahrenheit Output: Converted temperature
		 * 
		 */

		System.out.print("Enter Celsius: ");
		double c = sc.nextDouble();

		double f = (c * 9 / 5) + 32; // Only arithmetic operators

		System.out.println("Fahrenheit = " + f);

		/**
		 * 3) Relational + Logical – Student Pass/Fail
		 * 
		 * Input: marks Output: Pass / Fail
		 */

		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();

		// Using relational (>=) and logical (&&) operators
		boolean isPass = (marks >= 35) && (marks <= 100);

		if (isPass) {
			System.out.println("Result: PASS");
		} else {
			System.out.println("Result: FAIL");
		}

		/**
		 * 4. Relational – Movie Eligibility
		 * 
		 * Input: age Output: Allowed / Not Allowed
		 * 
		 * 
		 */

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		// Relational operator >=
		if (age >= 18) {
			System.out.println("Allowed to Watch the Movie");
		} else {
			System.out.println("Not Allowed to Watch the Movie");
		}

		/**
		 * 6.Logical – Login Check
		 * 
		 * Input: username, password Output: Login Success / Failed
		 * 
		 */
		
		

	}
}
