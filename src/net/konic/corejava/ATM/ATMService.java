package net.konic.corejava.ATM;

public class ATMService {

    private double balance = 10000;

    public void withdraw(double amount) throws InsufficientBalanceException{

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance in account");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Withdrawn Amount: ₹" + amount);
        System.out.println("Remaining Balance: ₹" + balance);
    }
}
