package net.konic.corejava.static1;

public class LoginService {
/**
 * Create a class LoginService
• static method: validateUser(username)
• instance method: logout()
Task:
Call validateUser() without object
Call logout() using object


 */
	    public static void validateUser(String username) {
	        System.out.println("User: " + username);
	    }

	    public void logout() {
	        System.out.println("User logged out successfully.");
	    }

	    public static void main(String[] args) {

	        LoginService.validateUser("KHADEER");

	        LoginService login = new LoginService();
	        login.logout();
	    }
	}


