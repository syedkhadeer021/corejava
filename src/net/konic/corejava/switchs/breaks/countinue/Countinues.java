package net.konic.corejava.switchs.breaks.countinue;

import java.util.Scanner;

public class Countinues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int b=sc.nextInt();       
		for(int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);


		
	}

	}
}
