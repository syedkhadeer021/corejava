package net.konic.corejava.overloading;

public class MobileRecharge {
	/**
	 * Recharge Mobile QUESTION:
	 * 
	 * Overload recharge() for plan and coupon.
	 * 
	 * INPUT: recharge(9000000000L) recharge(9000000000L, 299) recharge(9000000000L,
	 * 299, "NEW50")
	 * 
	 * OUTPUT: Recharge successful for 9000000000 Recharge ₹299 successful Recharge
	 * ₹299 with coupon NEW50 applied
	 * 
	 */

	void recharge(long number) {
		System.out.println("Recharge successful for " + number);
	}

	void recharge(long number, int amount) {
		System.out.println("Recharge ₹" + amount + " successful");
	}

	void recharge(long number, int amount, String coupon) {
		System.out.println("Recharge ₹" + amount + " with coupon " + coupon + " applied");
	}

	public static void main(String[] args) {

		MobileRecharge r = new MobileRecharge();

		r.recharge(9000000000L);
		r.recharge(9000000000L, 299);
		r.recharge(9000000000L, 299, "NEW50");
	}
}
