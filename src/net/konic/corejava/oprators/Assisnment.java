package net.konic.corejava.oprators;

import java.util.Scanner;

public class Assisnment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number :");
		int a = sc.nextInt();

		System.out.print("Enter second number :");
		int b = sc.nextInt();

		int x = a; // Copying a to x

		x += 5; // x = x + 5
		System.out.println("x += 5 : " + x);

		x -= 3; // x = x - 3
		System.out.println("x -= 3 : " + x);

		x *= 2; // x = x * 2
		System.out.println("x *= 2 : " + x);

		x /= 2; // x = x / 2
		System.out.println("x /= 2 : " + x);

	}

}
