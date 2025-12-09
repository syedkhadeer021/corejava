package net.konic.corejava.constructor;

public class MobileRecharge {

	int mobileNumber;

	MobileRecharge(int m) {
		mobileNumber = m;
	}

	static String getPlan(int amount) {

		if (amount == 199)
			return "1.5GB/day, 28 days";

		else if (amount == 299)
			return "2GB/day, 28 days";

		else if (amount == 599)
			return "1.5GB/day, 84 days";

		else
			return "Invalid Recharge Amount";
	}

	void recharge(int amount) {
		System.out.println("Recharge Successful: " + getPlan(amount));
	}

	public static void main(String[] args) {

		MobileRecharge user = new MobileRecharge(987654321);

		user.recharge(199);
	}
}
