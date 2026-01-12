package net.konic.corejava.exception;

public class AgeValidation {
	public static void checkage(int age) {

		if (age < 18) {
			throw new YoungerAgeException("Age Is Below 18,Not Allowed");
		}
		System.out.println("Age Is Valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkage(13);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handling" + e.getMessage());

		}
		System.out.println("Program Completed");
			}
}
