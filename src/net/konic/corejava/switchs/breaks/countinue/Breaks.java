package net.konic.corejava.switchs.breaks.countinue;

import java.util.Scanner;

public class Breaks {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int b=sc.nextInt();       
		for(int i = 1; i <= 10; i++) {
            if (i == b) {
                break; // stop loop when i reaches 5
            }
            System.out.println(i);


    
        }
	}
}
