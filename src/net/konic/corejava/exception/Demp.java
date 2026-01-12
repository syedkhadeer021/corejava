package net.konic.corejava.exception;

public class Demp {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Khadeer");
		System.out.println("Zakeer");
		try {
			System.out.println(1/0);
		} catch (RuntimeException e) {
			System.out.println("Wasif");
		}
		
		System.out.println("Srikath");
	}

}
