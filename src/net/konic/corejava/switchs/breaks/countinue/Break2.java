package net.konic.corejava.switchs.breaks.countinue;

import java.util.Scanner;


public class Break2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int price;

	        while(true) {
	            System.out.print("Enter stock price: ");
	            price = sc.nextInt();

	            if(price == -1) {
	                System.out.println("Stop reading at -1");
	                break;   
	            }

	            System.out.println("Price entered: " + price);
	        }
		
	}

}
