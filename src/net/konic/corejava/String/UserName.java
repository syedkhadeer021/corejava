package net.konic.corejava.String;

public class UserName {
	public static void main(String[] args) {

        String username = "adminUser01";

        if (username.startsWith("admin")) {
            System.out.println("Valid admin user");
        } else {
            System.out.println("Invalid user");
        }
    }
}
