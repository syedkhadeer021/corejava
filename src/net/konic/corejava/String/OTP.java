package net.konic.corejava.String;

public class OTP {
	   public static void main(String[] args) {

	        String otp = "12345";

	        StringBuilder sb = new StringBuilder(otp);

	       
	        sb.deleteCharAt(sb.length() - 1);

	        System.out.println("Updated OTP: " + sb);
	    }
}
