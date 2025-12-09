package net.konic.corejava.constructor;

public class BusTicket {
	/**
	 * Bus Ticket Booking (Constructor + Static fare)

Input: passenger="Mohammed", fare=500
Output:
Passenger: Mohammed
Ticket Fare: 500
Company: IRCTC

✳ Task:

Constructor sets passenger name

Static variable for company name and fare


	 */
	    static String company = "IRCTC";
	    static int fare = 500;

	    String passenger;

	    BusTicket(String p) {
	        passenger = p;
	    }
	    
	    void showTicket() {
	        System.out.println("Passenger: " + passenger);
	        System.out.println("Ticket Fare: " + fare);
	        System.out.println("Company: " + company);
	    }

	    public static void main(String[] args) {

	        BusTicket t1 = new BusTicket("Mohammed");

	        t1.showTicket();
	    }
	}



