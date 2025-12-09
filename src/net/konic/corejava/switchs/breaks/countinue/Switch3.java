package net.konic.corejava.switchs.breaks.countinue;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter order status: ");
		String status = sc.nextLine();

		switch (status.toUpperCase()) {
		case "PENDING":
			System.out.println("Your order is being processed");
			break;

		case "SHIPPED":
			System.out.println("Your order is on the way");
			break;

		case "DELIVERED":
			System.out.println("Your order has been delivered");
			break;

		case "CANCELLED":
			System.out.println("Your order has been cancelled");
			break;

		default:
			System.out.println("Invalid Status");
		}
	}
}
