package net.konic.corejava.ATM;

import java.util.Scanner;

public class ATMApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATMService atm = new ATMService();

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            atm.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Balance Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Amount Error: " + e.getMessage());

        } finally {
            System.out.println("Transaction Completed");
            sc.close();
        }
    }
}
