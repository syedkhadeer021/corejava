package net.konic.corejava.String;

public class AddressUpdate {

	public static void main(String[] args) {

		StringBuffer address = new StringBuffer("Street 5");
		String city = "Hyderabad";

		address.append(" ").append(city);

		System.out.println("Updated Address: " + address);
	}
}
