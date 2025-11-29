package net.konic.corejava.oprators;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double itemPrice = sc.nextDouble();

		System.out.println("Enter quantity: ");
		int quantity = sc.nextInt();

		double totalPrice = itemPrice * quantity;
		double tax = totalPrice * 0.10; // 10% tax
		double finalBill = totalPrice + tax;

		System.out.println("Item Price : " + itemPrice);
		System.out.println("Quantity   : " + quantity);
		System.out.println("Total Price: " + totalPrice);
		System.out.println("Tax (10%)  : " + tax);
		System.out.println("Final Bill : " + finalBill);

	}

}
