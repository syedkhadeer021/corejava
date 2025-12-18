package net.konic.corejava.String;

public class Hotel {
	public static void main(String[] args) {

        String a = "Hotel";
        String b = "Hotel";

        if (a == b) {
            System.out.println("Same memory location");
        } else {
            System.out.println("Different memory location");
        }
    }
}
