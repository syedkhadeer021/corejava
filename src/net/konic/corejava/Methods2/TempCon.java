package net.konic.corejava.Methods2;

import java.util.Scanner;

public class TempCon {
	/**
	 * Temperature Converter
	 * 
	 * Local variable for input
	 * 
	 * Instance variable to store Celsius
	 * 
	 * Method toFahrenheit() → returns converted value
	 * 
	 * Print in main.
	 * 
	 */
	double celsius;

	public double toFahrenheit() {
		return (celsius * 9 / 5) + 32;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TempCon tempcon = new TempCon();

		System.out.print("Enter temperature in Celsius: ");
		double input = sc.nextDouble();

		tempcon.celsius = input;

		double result = tempcon.toFahrenheit();

		System.out.println("Temperature in Fahrenheit: " + result);
	}

}
