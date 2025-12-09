package net.konic.corejava.static1;

public class Hotel {
	/**
	 * Create a class Hotel • static variable: hotelName • instance variable:
	 * roomNumber • Create object and print both values Task: Show that static can
	 * be accessed without object, non-static cannot.
	 */

	static String hotelName = "Surya";

	int roomNumber;

	public static void main(String[] args) {

		System.out.println("Hotel Name: " + Hotel.hotelName);

		Hotel h = new Hotel();
		h.roomNumber = 203;

		System.out.println("Room Number : " + h.roomNumber);
	}
}
