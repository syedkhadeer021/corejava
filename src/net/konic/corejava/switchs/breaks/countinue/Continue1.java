package net.konic.corejava.switchs.breaks.countinue;

public class Continue1 {
	public static void main(String[] args) {

		String[] emails = { "a@gmail.com", "abc", "test@yahoo.com" };

		for (String email : emails) {

			if (!email.contains("@")) {
				continue;
			}

			System.out.println(email);
		}
	}

}
