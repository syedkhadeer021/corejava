package net.konic.corejava.constructor;

public class BankAccount {
	/**
	 * Bank Account (Constructor + Static Variable)
	 * 
	 * Input: accountNo=101, name=“Rahul”, deposit=5000 Output: Bank: SBI Account
	 * No: 101 Customer: Rahul Balance: 5000
	 * 
	 * ✳ Task:
	 * 
	 * Use constructor to set accountNo & name
	 * 
	 * Use static variable for bankName
	 * 
	 * deposit() method updates balance
	 * 
	 * 
	 * 
	 */

	static String bankName = "SBI";

	int accountNo;
	String name;
	double balance;

	BankAccount(int a, String n) {
		accountNo = a;
		name = n;
		balance = 0;
	}

	void deposit(double amount) {
		balance = balance + amount;
	}

	void showDetails() {
		System.out.println("Bank: " + bankName);
		System.out.println("Account No: " + accountNo);
		System.out.println("Customer: " + name);
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {

		BankAccount acc = new BankAccount(10, "Khadeer");

		acc.deposit(1000);

		acc.showDetails();
	}
}
