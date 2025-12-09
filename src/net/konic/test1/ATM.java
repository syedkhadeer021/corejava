package net.konic.test1;

public class ATM {
	/**
	 * Bank ATM Machine
	 * 
	 * Task: Class ATM:
	 * 
	 * static variable bankName
	 * 
	 * non-static variable balance
	 * 
	 * default constructor → set balance=0
	 * 
	 * public constructor → set customerName
	 * 
	 * switch menu → 1) Deposit 2) Withdraw 3) Check Balance
	 * 
	 * 
	 * Input: 1, amount=500 Output: Deposited: 500
	 * 
	 */

	static String bankName = "SBI Bank";
	String customerName;
	int balance;

	public ATM() {
		balance = 0;
	}

	public ATM(String name) {
		customerName = name;
		balance = 0;
	}

	public void menu(int choice, int amount) {

		switch (choice) {

		case 1:
			balance = balance + amount;
			System.out.println("Deposited: " + amount);
			break;

		case 2:
			if (amount <= balance) {
				balance = balance - amount;
				System.out.println("Withdrawn: " + amount);
			} else {
				System.out.println("Insufficient Balance!");
			}
			break;

		case 3:
			System.out.println("Current Balance: " + balance);
			break;

		default:
			System.out.println("Invalid Option!");
		}
	}

	public static void main(String[] args) {

		ATM a = new ATM("Khadeer");
		System.out.println("Customer: " + a.customerName);
		System.out.println("Bank: " + ATM.bankName);

		a.menu(1, 500);
		a.menu(3, 0); 
	}
}
