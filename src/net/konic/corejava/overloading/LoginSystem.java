package net.konic.corejava.overloading;

public class LoginSystem {
	/**
	 * Login System (App Login) QUESTION:
	 * 
	 * Overload login() for username/password & OTP.
	 * 
	 * INPUT: login("shiraz", "pass123") login(9000000000L, 1234)
	 * 
	 * OUTPUT: Login success using Username & Password Login success using Mobile
	 * OTP
	 * 
	 * 
	 */

	void login(String username, String password) {
		System.out.println("Login success using Username & Password");
	}

	void login(long mobile, int otp) {
		System.out.println("Login success using Mobile OTP");
	}

	public static void main(String[] args) {

		LoginSystem l = new LoginSystem();

		l.login("shiraz", "pass123");
		l.login(9000000000L, 1234);
	}
}
