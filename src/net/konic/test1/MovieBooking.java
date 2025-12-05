package net.konic.test1;

public class MovieBooking {
	/**
	 * Movie Ticket Booking
	 * 
	 * Task: Class MovieBooking:
	 * 
	 * public constructor → set user
	 * 
	 * static method → showTheatre()
	 * 
	 * switch method → chooseMovie(int option)
	 * 
	 * non-static variable → ticketPrice
	 * 
	 * 
	 * Input: option = 2 Output: Booked: Jawan (₹250)
	 * 
	 */

	String user;
	int ticketPrice;

	public MovieBooking(String userName) {
		user = userName;
	}

	public static void showTheatre() {
		System.out.println("Available Theatres:");
		System.out.println("1. Inox");
		System.out.println("2. PVR");
		System.out.println("3. Cinepolis");
	}
	public void chooseMovie(int option) {
		switch (option) {

		case 1:
			ticketPrice = 200;
			System.out.println("Booked: Avenger end game (₹" + ticketPrice + ")");
			break;

		case 2:
			ticketPrice = 250;
			System.out.println("Booked: F1 (₹" + ticketPrice + ")");
			break;

		case 3:
			ticketPrice = 180;
			System.out.println("Booked: Avatar (₹" + ticketPrice + ")");
			break;

		default:
			System.out.println("Invalid Movie Option!");
		}
	}

	public static void main(String[] args) {

		MovieBooking.showTheatre();

		MovieBooking m = new MovieBooking("Khadeer");
		System.out.println("User: " + m.user);

		m.chooseMovie(2);
	}
}
