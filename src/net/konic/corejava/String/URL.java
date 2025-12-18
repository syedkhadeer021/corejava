package net.konic.corejava.String;

public class URL {
	 public static void main(String[] args) {

	        String p = "https";
	        String d = "konic.net";
	        String s = "/login";

	        String url = String.join("", p, "://", d, s);

	        System.out.println( url);
	    }
}
