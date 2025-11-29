package net.konic.corejava.Methods2;

import java.util.Scanner;

public class PrimeChecker {
	int number;  
    public void readNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();  

        number = n; 
    }

   
    public boolean isPrime() {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;   
            }
        }
        return true;  
    }

    public static void main(String[] args) {

        PrimeChecker primechecker = new PrimeChecker();

        primechecker.readNumber();  

        boolean result = primechecker.isPrime(); 

        if (result) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
