package net.konic.corejava.overloading;

public class RideBooking {
	/**
	 * Ride Booking – Ola/Uber
QUESTION:

Overload bookRide() with carType and passenger count.

INPUT:
bookRide("Ameerpet", "Hitech City")
bookRide("Ameerpet", "Hitech City", "SUV")
bookRide("Ameerpet", "Hitech City", 3)

OUTPUT:
Ride booked from Ameerpet to Hitech City
SUV ride booked from Ameerpet to Hitech City
Ride booked for 3 passengers from Ameerpet to Hitech City
	 */

	    void bookRide(String a, String b) {
	        System.out.println("Ride booked from " + a + " to " + b);
	    }

	    void bookRide(String a, String b, String c) {
	        System.out.println(c + " ride booked from " + a + " to " + b);
	    }

	    void bookRide(String a, String b, int c) {
	        System.out.println("Ride booked for " + c + " passengers from " + a + " to " + b);
	    }

	    public static void main(String[] args) {
	        RideBooking ob = new RideBooking();

	        ob.bookRide("Ameerpet", "Hitech City");
	        ob.bookRide("Ameerpet", "Hitech City", "SUV");
	        ob.bookRide("Ameerpet", "Hitech City", 3);
	    }
	}


