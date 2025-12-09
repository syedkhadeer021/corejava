package net.konic.corejava.oprators;

import java.util.Scanner;

public class Condinal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number :");
		int a = sc.nextInt();

		System.out.print("Enter second number :");
		int b = sc.nextInt();

		String result = (a > b) ? "A is greater" : "B is greater or equal";
		System.out.println("Result = " + result);

		sc.close();

	}

}
