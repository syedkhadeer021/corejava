package net.konic.corejava.Methods2;

import java.util.Scanner;

public class EvenOrOdd {
	int number;
	public void readNumber() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		number = sc.nextInt();
	}
	public boolean isEven() {
		return number % 2 == 0;
	}

	public static void main(String[] args) {

		EvenOrOdd evenorodd = new EvenOrOdd();

		evenorodd.readNumber();

		boolean result = evenorodd.isEven();

		System.out.println("Boolean Value: " + result);

		if (result) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}

	}
}
