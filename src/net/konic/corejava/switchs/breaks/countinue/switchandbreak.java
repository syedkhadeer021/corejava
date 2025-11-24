package net.konic.corejava.switchs.breaks.countinue;

import java.util.Scanner;

public class switchandbreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  int option;

	        while(true) {
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Exit");
	            System.out.print("Enter option: ");
	            option = sc.nextInt();

	            switch(option) {
	                case 1:
	                    System.out.println("Balance: ₹10,000");
	                    break;

	                case 2:
	                    System.out.println("Withdrawal Selected");
	                    break;

	                case 3:
	                    System.out.println("Deposit Selected");
	                    break;

	                case 4:
	                    System.out.println("Exit");
	                    break;  

	                default:
	                    System.out.println("Invalid Option");
	            }

	            if(option == 4) {
	                break;   
	            }
	        }
	    }
	
	
}
