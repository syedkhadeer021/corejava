package net.konic.corejava.Methods2;

import java.util.Scanner;

public class Cal {

	    int num1;  
	    int num2;  
	    public void readInput() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        num2 = sc.nextInt();
	    }
	    public int add() {
	        return num1 + num2;
	    }

	    public static void main(String[] args) {

	        Cal cal = new Cal();

	        cal.readInput();

	        int result = cal.add();

	        System.out.println("Sum = " + result); 
	    }
	}



