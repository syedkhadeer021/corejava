package net.konic.corejava.switchs.breaks.countinue;

import java.util.Scanner;

public class Switch1 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter option : ");
    int option = sc.nextInt();

    switch(option) {
        case 1:
            System.out.println("Data Pack Selected");
            break;

        case 2:
            System.out.println("SMS Pack Selected");
            break;

        case 3:
            System.out.println("Talktime Pack Selected");
            break;

        default:
            System.out.println("Invalid Option");
    }
	
}

}
