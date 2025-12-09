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
		System.out.println("1st qestion");
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
		System.out.println("2nd questin");
		System.out.print("Enter Celsius: ");
		double c = sc.nextDouble();

		double f = (c * 9 / 5) + 32; // Only arithmetic operators

		System.out.println("Fahrenheit = " + f);

		/**
		 * 3) Relational + Logical – Student Pass/Fail
		 * 
		 * Input: marks Output: Pass / Fail
		 */
		System.out.println("3rd question");
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
		System.out.println("4th question");
		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		// Relational operator >=
		if (age >= 18) {
			System.out.println("Allowed to Watch the Movie");
		} else {
			System.out.println("Not Allowed to Watch the Movie");
		}

		/**
		 * 5.Logical – Login Check
		 * 
		 * Input: username, password Output: Login Success / Failed
		 * 
		 */
		System.out.println("5th question");
		String validUsername = "admin";
		String validPassword = "pass123";

		System.out.println("Enter username: ");
		String username = sc.nextLine().trim();

		System.out.println("Enter password: ");
		String password = sc.nextLine().trim();

		if (username.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Failed");
		}

		/**
		 * 6) Assignment Operator Practice
		 * 
		 * Input: number Operations: number += 5, number -= 3, number *= 2, number /= 2
		 * Output: Updated values after each operation
		 * 
		 */
		System.out.println("6th question");
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		number += 5;
		System.out.println("After number += 5 : " + number);

		number -= 3;
		System.out.println("After number -= 3 : " + number);

		number *= 2;
		System.out.println("After number *= 2 : " + number);

		number /= 2;
		System.out.println("After number /= 2 : " + number);

		/**
		 * 7. Increment & Decrement – People in Hall
		 * 
		 * Start: 10 Input: 3 entered (++), 2 left (--) Output: Final count
		 * 
		 * 
		 */
		System.out.println("7th question");
		int people = 10; // starting count

		// 3 people enter (++)
		people++;
		people++;
		people++;

		// 2 people leave (--)
		people--;
		people--;

		System.out.println("Final count = " + people);

		/**
		 * 8) Increment & Decrement – Parking Slots
		 * 
		 * Start: 50 Input: car parked (--), car exit (++) Output: Available slots
		 */
		System.out.println("8th question");
		int slots = 50; // starting available slots

		// 1 car parked
		slots--;

		// 1 car exited
		slots++;

		System.out.println("Available slots = " + slots);

		/**
		 * 9) Increment – Voting Machine
		 * 
		 * Start: votes = 0 Input: Add 5 votes using ++ Output: Final votes count
		 * 
		 */
		System.out.println("9th question");
		int votes = 0; // starting votes

		votes++;
		votes++;
		votes++;
		votes++;
		votes++;

		System.out.println("Final votes = " + votes);

		/**
		 * 10) Increment – Bank Token System
		 * 
		 * Start: token = 100 Input: issue 5 tokens (++) Output: Tokens:
		 * 101,102,103,104,105
		 */

		System.out.println("10th question");
		int token = 100; // starting token number

		token++; // 101
		System.out.println("Token: " + token);

		token++; // 102
		System.out.println("Token: " + token);

		token++; // 103
		System.out.println("Token: " + token);

		token++; // 104
		System.out.println("Token: " + token);

		token++; // 105
		System.out.println("Token: " + token);

	}
}
