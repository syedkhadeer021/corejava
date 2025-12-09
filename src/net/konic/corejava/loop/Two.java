package net.konic.corejava.loop;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num;

	        do {
	            System.out.print("Enter a number (3 to stop): ");
	            num = sc.nextInt();   // read number

	        } while (num != 0);   // repeat until user enters 0

	        System.out.println("You entered 0. Program ended.");
	        

	}
}
