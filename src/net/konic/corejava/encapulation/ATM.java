package net.konic.corejava.encapulation;

public class ATM {
	 private int balance;

	    public void setBalance(int balance) {
	        this.balance = balance;
	    }

	    public void withdraw(int amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdraw Successful");
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

public static void main(String[] args) {

    ATM atm = new ATM();

    atm.setBalance(5000);
    int withdrawAmount = 2000;

    atm.withdraw(withdrawAmount);
}
}
