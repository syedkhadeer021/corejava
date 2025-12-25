package net.konic.corejava.String;

public class Number {
	 public static void main(String[] args) {

	        String mobile = "9876543210";

	        String masked =
	                mobile.substring(0, 2) +
	                "******" +
	                mobile.substring(mobile.length() - 2);

	        System.out.println(masked);
	    }

}
