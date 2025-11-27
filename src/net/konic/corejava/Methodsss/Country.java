package net.konic.corejava.Methodsss;

public class Country {
	public String cou(String country) {
		System.out.println("country " + country);
		return "india";

	}

	public static void main(String[] args) {
		Country country = new Country();
		country.cou("india");


	}

}
