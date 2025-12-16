package net.konic.corejava.encapulation;

public class BankAccount {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setBalance(5000);
		System.out.println( "balance is : " +ba.getBalance());
		}

}
