package net.konic.corejava.oprators;

import java.util.Scanner;

public class Logical {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number :");
		int a = sc.nextInt();

		System.out.print("Enter second number :");
		int b = sc.nextInt();

		boolean cond1 = (a > b);
		boolean cond2 = (a != 0);

		System.out.println("cond1 && cond2 : " + (cond1 && cond2)); // AND
		System.out.println("cond1 || cond2 : " + (cond1 || cond2)); // OR
		System.out.println("!cond1         : " + (!cond1)); // NOT

	}

}
