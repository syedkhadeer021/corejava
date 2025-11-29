package net.konic.corejava.Methods2;

public class BankAccount {
	int balance;  

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount bankaccount = new BankAccount();
        bankaccount.deposit(100000); 
        bankaccount.deposit(20);   

        int bal = bankaccount.getBalance();  

        System.out.println("Current Balance: " + bal);
    }
}


